import java.io.*;
import javax.sound.sampled.*;

public class SuperBass {
		
		public static class Song implements Runnable {
			@Override
			public void run(){
				try {
					File file = new File("superbass.wav");
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(file));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength());
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			}
		}

		public static void startSong() {
			Thread songThread = new Thread(new Song());
			songThread.start();
		}

    public static void main(String[] args) {
				startSong();
        //verse 1
        try {
            Thread.sleep(8400);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("This one is for the boys with the booming system");
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Top down, AC with the cooling system");
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("When he come up in the club, he be blazin' up");
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Got stacks on deck like he savin' up");
        try {
            Thread.sleep(1500);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("And he ill, he real, he might gotta deal");
        try {
            Thread.sleep(2500);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("He pop bottles and he got the right kind of build");
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("He cold, he dope, he might sell coke");
        try {
            Thread.sleep(1500);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("He always in the air, but he never fly coach");
        try {
            Thread.sleep(1500);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("He a muthafuckin trip, trip");
        try {
            Thread.sleep(1200);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Sailor of the ship, ship");
        try {
            Thread.sleep(1200);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("When he make it drip, drip");
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Kiss him on the lip, lip");
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("That's the kind of dude I was lookin' for");
        try {
            Thread.sleep(1500);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("And yes you'll get slapped if you're lookin' ho");
        try {
            Thread.sleep(1700);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("I said, excuse me you're a hell of a guy");
        try {
            Thread.sleep(1800);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("I mean my, my, my, my you're like pelican fly");
        try {
            Thread.sleep(1800);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("I mean, you're so shy and I'm loving your tie");
        try {
            Thread.sleep(1800);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("You're like slicker than the guy with the thing on his eye, oh");
        try {
            Thread.sleep(2400);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Yes I did, yes I did");
        try {
            Thread.sleep(1400);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Somebody please tell em who the eff I is");
        try {
            Thread.sleep(1900);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("I am Nicki Minaj, I mack them dudes up");
        try {
            Thread.sleep(1900);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Back coupes up and chuck the deuce up");
        try {
            Thread.sleep(1800);
        }
        catch (InterruptedException ex)
        {
        }
        
        //chorus
        System.out.println("Boy you got my heartbeat running away");
        try {
            Thread.sleep(2700);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Beating like a drum and it's coming your way");
        try {
            Thread.sleep(3300);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Can't you hear that boom badoom boom boom badoom boom bass");
        try {
            Thread.sleep(3800);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("He got that super bass");
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Boom badoom boom boom badoom boom bass");
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Yeah, it's that super bass");
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Boom");
        try {
            Thread.sleep(6500);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Boom badoom boom boom badoom boom bass");
        try {
            Thread.sleep(2800);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("He got that super bass");
        try {
            Thread.sleep(1800);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Boom badoom boom boom badoom boom bass");
        try {
            Thread.sleep(1800);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Yeah, it's that super bass");
        try {
            Thread.sleep(1800);
        }
        catch (InterruptedException ex)
        {
        }
        
        //verse 2
        System.out.println("This one if for the boys in the polos");
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Entrepreneur niggas and the moguls");
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("He could ball with the crew, he could solo");
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("But I think I like him better when he dolo");
        try {
            Thread.sleep(1500);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("And I think I like him better with the fitted cap on");
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("He ain't even gotta try to put the mack on");
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("He just gotta give me that look, when he give me that look");
        try {
            Thread.sleep(2300);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Then the panties comin' off, off, uh");
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Excuse me you're a hell of a guy");
        try {
            Thread.sleep(1400);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("You know I've really got a thing for American guys");
        try {
            Thread.sleep(1600);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("I mean, sigh, sickenin' eyes");
        try {
            Thread.sleep(1700);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("I can tell that you're in touch with your feminine side, oh");
        try {
            Thread.sleep(2400);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Yes I did, yes I did");
        try {
            Thread.sleep(1400);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Somebody please tell em who the eff I is");
        try {
            Thread.sleep(1900);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("I am Nicki Minaj, I mack them dudes up");
        try {
            Thread.sleep(1900);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Back coupes up and chuck the deuce up");
        try {
            Thread.sleep(1800);
        }
        catch (InterruptedException ex)
        {
        }
        
        //chorus
        System.out.println("Boy you got my heartbeat running away");
        try {
            Thread.sleep(2700);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Beating like a drum and it's coming your way");
        try {
            Thread.sleep(3300);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Can't you hear that boom badoom boom boom badoom boom bass");
        try {
            Thread.sleep(3800);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("He got that super bass");
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Boom badoom boom boom badoom boom bass");
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Yeah, it's that super bass");
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Boom");
        try {
            Thread.sleep(6500);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Boom badoom boom boom badoom boom bass");
        try {
            Thread.sleep(2800);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("He got that super bass");
        try {
            Thread.sleep(1800);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Boom badoom boom boom badoom boom bass");
        try {
            Thread.sleep(1800);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Yeah, it's that super bass");
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException ex)
        {
        }
        
        
        //bridge
        System.out.println("See I need you in my life for me to stay");
        try {
            Thread.sleep(4000);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("No, no, no, no, no, I know you'll stay");
        try {
            Thread.sleep(4000);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("No, no, no, no, no, don't go away");
        try {
            Thread.sleep(5300);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Boy you got my heartbeat runnin' away");
        try {
            Thread.sleep(3500);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Don't you hear that heartbeat comin' your way?");
        try {
            Thread.sleep(3500);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Oh it be like boom badoom boom boom badoom boom bass");
        try {
            Thread.sleep(3800);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Can't you hear that boom badoom boom boom badoom boom bass?");
        try {
            Thread.sleep(4800);
        }
        catch (InterruptedException ex)
        {
        }
        
        //chorus
        System.out.println("Boy you got my heartbeat running away");
        try {
            Thread.sleep(2700);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Beating like a drum and it's coming your way");
        try {
            Thread.sleep(3300);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Can't you hear that boom badoom boom boom badoom boom bass");
        try {
            Thread.sleep(3800);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("He got that super bass");
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Boom badoom boom boom badoom boom bass");
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Yeah, it's that super bass");
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Boom");
        try {
            Thread.sleep(6500);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Boom badoom boom boom badoom boom bass");
        try {
            Thread.sleep(2800);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("He got that super bass");
        try {
            Thread.sleep(1800);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Boom badoom boom boom badoom boom bass");
        try {
            Thread.sleep(1800);
        }
        catch (InterruptedException ex)
        {
        }
        System.out.println("Yeah, it's that super bass");
        try {
            Thread.sleep(1800);
        }
        catch (InterruptedException ex)
        {
        }
        
    }
}
