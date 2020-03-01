public class Loader
{
    public static void main(String[] args)
    {
        String news = "A forgotten passageway used by prime ministers and political luminaries - and closed up by Victorian labourers - has been uncovered in Parliament. Historians working on the renovation of the House of Commons found the lost 360-year-old passageway, hidden in a secret chamber. The doorway was created for the coronation of Charles II, in 1660, to allow guests access to a celebratory banquet in Westminster Hall, the building next to the modern day Commons chamber. It was used by generations of MPs and political notables, such as the diarist Samuel Pepys, as the main entrance to the Commons but was blocked up before being concealed within the thick walls of the ancient building. It was briefly rediscovered in 1950, during repairs to bomb damage, but then sealed off again and forgotten about - until now. To say we were surprised is an understatement - we really thought it had been walled-up forever after the war, said Mark Collins, Parliament's Estates Historian. Liz Hallam Smith, historical consultant to Parliament's architecture and heritage team, said: I was awestruck, because it shows that the Palace of Westminster still has so many secrets to give up. It is the way that the Speaker's procession would have come, on its way to the House of Commons, as well as many MPs over the centuries, so it's a hugely historic space.";
        String[] wordNews = news.split("\\s+");
        for (int i = 0; i < wordNews.length; i++)
        {
            System.out.println(wordNews[i]);
        }
    }
}