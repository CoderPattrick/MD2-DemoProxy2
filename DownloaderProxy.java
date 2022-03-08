public class DownloaderProxy {
    public void download(String url,String target){
        Downloader d = new Downloader();
        d.setUserAgent("FireFox");
        d.download(url,target);
    }
}
