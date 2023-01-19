import java.util.*;
import java.io.*;

public class AdvancedWar {
    public static void main(String args[]) throws Exception
    {
        Scanner scan=new Scanner(new File("AdvancedWar.dat"));
        int numOfLines=scan.nextInt();
        scan.nextLine();
        for(int i=0; i<numOfLines; i++)
        {
           String cards=scan.nextLine();
           //System.out.println(cards);
           Scanner cScan=new Scanner(cards);
           String[] hand=new String[4];
           for(int y=0; y<4; y++)
           {
               hand[y]=cScan.next();
            }        
            int[] royals=new int[4];
            int[] nums=new int[4];
            for(int y=0; y<4; y++)
            {
                if(hand[y].equals("J"))
                    royals[y]=11;
                else if(hand[y].equals("Q"))
                    royals[y]=12;
                else if(hand[y].equals("K"))
                    royals[y]=13;
                else if(hand[y].equals("A"))
                    royals[y]=14;
                else
                    nums[y]=Integer.parseInt(hand[y]);
            }
            int nMax=0;
            for(int y=0; y<nums.length; y++)
            {
                if(nums[y]>nMax)
                    nMax=nums[y];
            }
            int nSecMax=0;
            for(int y=0; y<nums.length; y++)
            {
                if(nums[y]>nSecMax&&nums[y]!=nMax)
                    nSecMax=nums[y];
            }
            int rMax=0;
            for(int y=0; y<royals.length; y++)
            {
                if(royals[y]>rMax)
                    rMax=royals[y];
            }
            int rSecMax=0;
            for(int y=0; y<nums.length; y++)
            {
                if(royals[y]>rSecMax&&royals[y]!=rMax)
                    rSecMax=royals[y];
            }
            double strongestNum=nMax*nSecMax;
            double strongestRoyal=(rMax+rSecMax)*2;
            double strongestCom=(double)nMax*(double)rMax/2;
            // System.out.println("nMax: "+nMax+" nSecMax: "+nSecMax+" strongestNum: "+strongestNum);
            // System.out.println("rMax: "+rMax+" rSecMax: "+rSecMax+" strongestRoyal: "+strongestRoyal);
            // System.out.println("nMax: "+nMax+" rMax: "+rMax+" strongestCom: "+strongestCom);
            String answer="";
            if(strongestNum>strongestRoyal && strongestNum>strongestCom)
            {
                for(int y=0; y<hand.length; y++)
                {
                    if(nums[y]==nMax || nums[y]==nSecMax)
                        answer+=nums[y]+" ";
                }
                System.out.println(answer);
            }
            else if(strongestRoyal>strongestNum && strongestRoyal>strongestCom)
            {
                for(int y=0; y<royals.length; y++)
                {
                    if(royals[y]==rMax || royals[y]==rSecMax)
                    {
                        if(royals[y]==11)
                            answer+="J ";
                        else if(royals[y]==12)
                            answer+="Q ";
                        else if(royals[y]==13)
                            answer+="K ";
                        else
                            answer+="A ";
                    }
                }
                System.out.println(answer);
            }
            else
            {
                String lookingFor="";
                if(rMax==11)
                    lookingFor="J";
                else if(rMax==12)
                    lookingFor="Q";
                else if(rMax==13)
                    lookingFor="K";
                else
                    lookingFor="A";
                for(int y=0; y<hand.length; y++)
                {
                    if(hand[y].equals(lookingFor))
                    {
                        answer+=lookingFor+" ";
                    }
                    if(hand[y].equals(String.valueOf(nMax)))
                    {
                        answer+=nMax+" ";
                    }
                }
                System.out.println(answer);
            }
       }
    }
}