object question3 extends App{

    def bookprice(n:Int)=if(n>50) 24.95*100/60*n+(n-50)*0.75+50*3 else 24.95*100/60*n+n*3;


    println("cost is:" + bookprice(60));
}
