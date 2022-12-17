void swap(int *a,int *b){
    int t;
    t=*a;
    *a=*b;
    *b=t;
}
void reverse(int *c,int d,int e){
    while(d<e){
        swap(&c[d++],&c[e--]);
    }
}
void rotate(int* nums, int n, int k){
    k=k%n;
    reverse(nums,0,n-k-1);
    reverse(nums,n-k,n-1);
    reverse(nums,0,n-1);
}
