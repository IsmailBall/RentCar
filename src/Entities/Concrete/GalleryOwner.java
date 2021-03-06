<<<<<<< HEAD

package Entities.Concrete;

import Business.RentCarSystem;
import Entities.Abstract.User;
import GUI.SaleSheet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GalleryOwner extends User{
    
    private int galleryOwner_id;
    private ArrayList<Gallery> galleries = new ArrayList<>();
    
    private static int totalGallOwner = 0;
    
    public GalleryOwner(int galleryOwner_id,
            String fullName, String gender, int age, String imgPath, String phoneNumber, Mail mailAdress,
            String Username, String homeAddress, String Password, String resetPasswordQuestion, String resetPasswordAnswer) {
        super(fullName, gender, age, imgPath, phoneNumber, mailAdress, Username, homeAddress, Password, resetPasswordQuestion, resetPasswordAnswer);
        this.galleryOwner_id = galleryOwner_id;
        totalGallOwner++;
    }
    
    public GalleryOwner() {
        super("", "", 0, "", "", new Mail(), "", "", "", "", "");
    }

    public static int getTotalGallOwner() {
        return totalGallOwner;
    }
    
    public int getGalleryOwner_id() {
        return galleryOwner_id;
    }

    public ArrayList<Gallery> getGalleries() {
        return galleries;
    }

    
    public boolean addGallery(String galleryName) throws SQLException {
        
        if ( RentCarSystem.getGalleries().get( RentCarSystem.getGalleries().size() - 1) == null )
            throw new NullPointerException();
        
        Gallery gallery = new Gallery(RentCarSystem.getGalleries().get( RentCarSystem.getGalleries().size() - 1).getId() + 1, galleryName);
        RentCarSystem.getGalleries().add( gallery );
        galleries.add( gallery );
        RentCarSystem.addGalleryToDatabase(gallery, galleryOwner_id);
        
        return true;
    }
    
    public boolean deleteGallery(int galleryID) throws SQLException {
        for ( Gallery gallery : galleries ) {
            if ( galleryID == gallery.getId() ) {
                galleries.remove( gallery );
                RentCarSystem.deleteGalleryFromDatabase( gallery );
                RentCarSystem.getGalleries().remove( gallery );
                return true;
            }
        }
        
        return false;
    }
    
    public boolean updateGallery(String oldGalleryName, String newGalleryName) throws SQLException {
        for ( Gallery gallery : galleries ) {
            if ( oldGalleryName.equalsIgnoreCase( gallery.getName() ) ) {
                gallery.setName( newGalleryName );
                RentCarSystem.updateGalleryInDatabase( gallery );
                return true;
            }
        }
        
        return false;
    }
    
    public void updateCar(Car car) throws SQLException {
        if ( car.getSmall_imgPath() == null || car.getSmall_imgPath() == null )
            throw new IllegalArgumentException("You didn't choose one of the car image...");
        RentCarSystem.updateCarDatabase(car);
    }
    
    public boolean deleteCar(int carID) throws SQLException {
        Car car = RentCarSystem.getCarById(carID);
        
        if ( car == null )
            throw new NullPointerException();
        
        for ( Gallery gallery : galleries ) {
            if ( gallery.getCars().contains(car) ) {
                gallery.getCars().remove(car);
                RentCarSystem.getCars().remove(car);
                RentCarSystem.deleteCarFromDatabase(car);
                return true;
            }
        }
        
        return false;
    }
    
    public boolean addCar(Car car) throws SQLException {
        RentCarSystem.addCarToDatabase( car );
        RentCarSystem.getGalleryById( car.getGalleryId() ).getCars().add(car);
        return RentCarSystem.getCars().add( car );
    }

    @Override
    public void printOrder(Order order) {
        SaleSheet saleSheet = new SaleSheet(order, this.getFullName());
        saleSheet.setVisible( true );
        saleSheet.setLocationRelativeTo( null );
    }

    @Override
    public String toString() {
        return super.toString() + " GalleryOwner{" + "galleryOwner_id=" + galleryOwner_id + ", galleries=" + galleries + '}';
    }
    
}
=======

package Entities.Concrete;

import Entities.Abstract.Person;

public class GalleryOwner extends Person{
    
    private int id;
    private Gallery gallery;
    
    private static int total_id = 0;

    public GalleryOwner(String galleryName, String fullName, 
            String gender, int age, String imgPath, String phoneNumber, Mail mailAdress,
            String Username, String Password, String resetPasswordQuestion, String resetPasswordAnswer)
    {
        super(fullName, gender, age, imgPath, phoneNumber, mailAdress, Username, Password, resetPasswordQuestion, resetPasswordAnswer);
        this.id = total_id++;
        this.gallery = new Gallery(galleryName);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Gallery getGallery() {
        return gallery;
    }

    public void setGallery(Gallery gallery) {
        this.gallery = gallery;
    }

    @Override
    public String toString() {
        return super.toString() + gallery + "\n";
    }
    
    
}
>>>>>>> master
