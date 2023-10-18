/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) 
{
    var res=[];
    let count=0;
    for( let i=0;i<arr.length;i+=size)
    {
        var temp=[];
        for(let j=0;j<size && j<arr.length;j++)
        {
            if(arr[count]!=null)
            temp[j]=arr[count++];
            

        }
        res.push(temp);
    }
    return res;

    
};
