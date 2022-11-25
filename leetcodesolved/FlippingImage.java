package leetcodesolved;
//leetcode: https://leetcode.com/problems/flipping-an-image/

import java.util.Arrays;

public class FlippingImage {
    public static void main(String[] args) {

        int[][] mat={{1,1,0},
                    {1,0,1},
                    {0,0,0}};
        System.out.println("Answer: ");
        flipAndInvertImage(mat);
        for (int[] arr :
                mat) {
            System.out.println(Arrays.toString(arr));
        }

    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int c= image[i].length-1;
            for(int j=0;j<image[i].length/2;j++){
                int temp=image[i][j];
                image[i][j]=image[i][c];

                image[i][c]=temp;
                c=c-1;
            }
        }

        for (int k = 0; k < image.length; k++) {
            for (int l = 0; l < image[k].length; l++) {
                switch (image[k][l]) {
                    case 0:
                        image[k][l]=1;
                        break;

                    default:
                        image[k][l]=0;
                        break;
                }
            }
        }
        return image;
    }
}
