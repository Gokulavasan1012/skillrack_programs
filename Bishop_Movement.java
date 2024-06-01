import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int xBishop=sc.nextInt();
		int yBishop=sc.nextInt();
		int xPawn=sc.nextInt();
		int yPawn=sc.nextInt();
		int totalSquares=0;
		int tempX=xBishop+1,tempY=yBishop+1;
		while(tempX<r && tempY<c)
		{
		    if(tempX==xPawn && tempY==yPawn)
		    {
		        break;
		    }
		    totalSquares+=1;
		    tempX+=1;
		    tempY+=1;
		}
		tempX=xBishop-1;
		tempY=yBishop-1;
		while(tempX>=0 && tempY>=0)
		{
		    if(tempX==xPawn && tempY==yPawn)
		    {
		        break;
		    }
		    totalSquares+=1;
		    tempX-=1;
		    tempY-=1;
		}
		tempX=xBishop-1;
		tempY=yBishop+1;
		while(tempX>=0 && tempY<c)
		{
		    if(tempX==xPawn && tempY==yPawn)
		    {
		        break;
		    }
		    totalSquares+=1;
		    tempX-=1;
		    tempY+=1;
		}
		tempX=xBishop+1;
		tempY=yBishop-1;
		while(tempX<r && tempY>=0)
		{
		    if(tempX==xPawn && tempY==yPawn)
		    {
		        break;
		    }
		    totalSquares+=1;
		    tempX+=1;
		    tempY-=1;
		}
		System.out.print(totalSquares);
	}

    
    
}
