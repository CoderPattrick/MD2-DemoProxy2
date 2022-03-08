public class Downloader implements iDownloader {
    private String UserAgent;

    public Downloader() {
    }

    public String getUserAgent() {
        return UserAgent;
    }

    public void setUserAgent(String userAgent) {
        UserAgent = userAgent;
    }

    @Override
    public void download(String url,String target) {
        System.out.println("UserAgent: "+UserAgent);
        System.out.printf("Downloading from %s to %s\n",url,target);
    }
}
