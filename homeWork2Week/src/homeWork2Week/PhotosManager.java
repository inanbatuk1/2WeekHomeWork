package homeWork2Week;

public class PhotosManager {
	
	public void addtoPhotoAndVideo(Photos photo,Videos videos) {
		
		System.out.println("Resim ba�ar�yla eklendi. " +photo.photoName +"\n"
		+videos.videoName+" "+videos.videoDesc);
		
	}
	
	public void likePhotoAndVideo(Photos photo,Videos videos) {
		
		System.out.println("xxx ki�isi be�endi "+photo.totalLike+"\n"+videos.totalLike);
		
	}
	
}
