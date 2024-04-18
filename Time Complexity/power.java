public static void power1(int x,int n){
    if(n==0){
        return 1;
    }
    int xpnm1=power(x,n-1);
    int xpn=xpnm1*x;
    return xpn;
}
// T(n)= kn;

public static void power2(int x,int n){
    if(n==0){
        return 1;
    }
    int xpnb2=power2(x,n/2);
    int xpn=xpnb2*xpnb2;
    if(n%2==1){
        xpn=xpn*x;
    }
}
// T(n)= klog(n);

public static void power3(int x,int n){
    if(n%2==0){
        return power3(x,n/2)*power3(x,n/2);
    }
    else{
        return power3(x,n/2)*power3(x,n/2)*x;
    }
} 