class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public int lengthOfLIS(int[] nums) {
        return fun(0,0,nums,list);
    }
    int fun(int i,int p,int[]nums,List<List<Integer>> list){
       for(int a:nums){
            if (list.size() == 0 || a > list.get(list.size() - 1).get(0)) {
                list.add(new ArrayList<>(Arrays.asList(a, i)));
            } 
            else{
                int l=0;
                int h=list.size()-1;
                int id=-1;
            while(l<=h){
                    int mid=(l+h)/2;
                    if(list.get(mid).get(0)>=a){
                        id=mid;
                        h=mid-1;
                    }else{
                        l=mid+1;
                    }
                }
                list.set(id, new ArrayList<>(Arrays.asList(a, i)));
            }
            i++;

       }
       return list.size();
    }
}
// class Solution {
// public:
//     int lengthOfLIS(vector<int>& nums) {
//         vector<vector<int>>list;
        
//         int i=0;
//         for(auto a:nums){
//             if(list.size()==0 || a>list.back()[0]){
//                 list.push_back({a,i});
//             }else{
//                 // for(int j=0;j<list.size();j++){
//                 //     if(list[j][0]>=a){
//                 //         if(i>list[j][1]){
//                 //             list[j]={a,i};
//                 //         }
//                 //         break;
//                 //     }
//                 // }
//                 int l=0;
//                 int h=list.size()-1;
//                 int id=-1;

//                 while(l<=h){
//                     int mid=(l+h)/2;
//                     if(list[mid][0]>=a){
//                         id=mid;
//                         h=mid-1;
//                     }else{
//                         l=mid+1;
//                     }
//                 }

//                 if(i>list[id][1]){
//                     list[id]={a,i};
//                 }
//             }
//             i++;

//             // for(auto a:list) cout<<a[0]<<","<<a[1]<<"  ";
//             // cout<<endl;
//         }


//         //for(auto a:list) cout<<a[0]<<" ";

        


//         return list.size();
//     }
// };
