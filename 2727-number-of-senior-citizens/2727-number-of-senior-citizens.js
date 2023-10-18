/**
 * @param {string[]} details
 * @return {number}
 */
var countSeniors = function(details) 
{
        let count=0;
        for(let i=0;i<details.length;i++)
        {
            // console.log(details[i].substring(11,13))
            // let a=parseInt(details[i].substring(11,13))
            if(details[i].substring(11,13)>60)
            {count++;}

        }
        return count;
};