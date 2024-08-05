package lab_dio_iphone_simulation;

public class iPhone implements MusicPlayerInterface, PhoneInterface, InternetBrowserInterface {

	@Override
    public void playMusic() {
        System.out.println("Ouvindo Música...");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Música Pausada!");
    }

    @Override
    public void stopMusic() {
        System.out.println("Música Parou!");
    }

    @Override
    public void adjustVolume(int volume) {
        System.out.println("Volume Definido como " + volume);
    }

    @Override
    public void makeCall(String phoneNumber) {
        System.out.println("Chamando " + phoneNumber + "...");
    }

    @Override
    public void receiveCall() {
        System.out.println("Recebendo uma Chamada...");
    }

    @Override
    public void endCall() {
        System.out.println("Chamada Finalizada!");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("Abrindo URL: " + url);
    }

    @Override
    public void bookmarkPage() {
        System.out.println("Página Marcada!");
    }

    @Override
    public void refreshPage() {
        System.out.println("Página Atualizada!");
    }

    public void useMusicPlayer() {
        System.out.println("Usando Recursos do Music Player!");
    }

    public void usePhone() {
        System.out.println("Usando Recursos do Telefone!");
    }

    public void useBrowser() {
        System.out.println("Usando Recursos do Navegador de Internet!");
    }

}
