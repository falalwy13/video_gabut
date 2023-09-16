import java.io.IOException;

public class videogabut {

    public static void main(String[] args) {
        // URL video YouTube
        String videoURL = "https://www.youtube.com/watch?v=dQw4w9WgXcQ";

        // Cek sistem operasi
        String os = System.getProperty("os.name").toLowerCase();
        
        try {
            if (os.contains("win")) {
                // Untuk Windows, buka Chrome
                ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", "start", "chrome", videoURL);
                processBuilder.start();
            } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
                // Untuk Linux dan Mac, buka Firefox
                ProcessBuilder processBuilder = new ProcessBuilder("firefox", videoURL);
                processBuilder.start();
            } else {
                System.out.println("Sistem operasi tidak didukung.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
