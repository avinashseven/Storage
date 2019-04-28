package cartesianplane;

import java.util.ArrayList;
public class Sequence
{
    public static void main(String args[])
    {
        Sequence sequence = new Sequence();
        sequence.values.add(1);
        sequence.values.add(4);
        sequence.values.add(9);
        sequence.values.add(16);
        Sequence sequence1 = new Sequence();
        sequence1.values.add(9);
        sequence1.values.add(7);
        sequence1.values.add(4);
        sequence1.values.add(9);
        sequence1.values.add(11);
        sequence.append(sequence1);
        System.out.println("Appended values is"+sequence.append(sequence1));
        System.out.println("Merged value is"+sequence.merge(sequence1));


        Sequence sequence3 = new Sequence();
        sequence3.values.add(4);
        sequence3.values.add(7);
        sequence3.values.add(9);
        sequence3.values.add(9);
        sequence3.values.add(11);

        sequence.append(sequence3);
        System.out.println("Sorted Sequence is"+sequence.mergeSorted(sequence3));
    }
    public ArrayList <Integer > values;

    public Sequence()
    {
        values = new ArrayList <Integer >();
    }
    public Sequence append(Sequence together)
    {
        Sequence append = new Sequence();
        for(int i=0;i<this.values.size();i++)
        {
            append.values.add(this.values.get(i));
        }
        for(int i=0;i<together.values.size();i++)
        {
            append.values.add(together.values.get(i));
        }
        return append;
    }
    public Sequence merge(Sequence other)
    {
        int thisSize = this.values.size();
        int otherSize= other.values.size();
        int maxSize = thisSize>otherSize?thisSize:otherSize;
        Sequence merge = new Sequence();
        for(int i=0;i<maxSize;i++)
        {
            if(i<thisSize)
                merge.values.add(this.values.get(i));
            if (i <otherSize)
                merge.values.add(other.values.get(i));

        }
        return merge;
    }
    public Sequence mergeSorted(Sequence other)
    {
        int thisSize = this.values.size();
        int otherSize= other.values.size();
        int maxSize = thisSize>otherSize?thisSize:otherSize;
        int i=0;
        int j=0;
        Sequence mergeSorted = new Sequence();
        while((i<maxSize&&j<maxSize))
        {
            if(i<thisSize && j<otherSize && this.values.get(i)<=other.values.get(j))
            {
                mergeSorted.values.add(this.values.get(i));
                i++;
            }
            else if (j<otherSize)
            {
                mergeSorted.values.add(other.values.get(j));
                j++;
            }
        }
        return mergeSorted;

    }
    public ArrayList<Integer> getvalues()
    {

        return this.values;

    }
    public void add(int n)
    {
        values.add(n);
    } public String toString()
{
    return values.toString();
}
}