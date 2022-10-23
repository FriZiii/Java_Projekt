import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static int check_prime(int n)
    {
        for(int i =2; i<n; i++) {
            if (n % i == 0)
                return 0;
        }
         return n;
    }
    public static ArrayList<Integer> get_primes()
    {
        ArrayList<Integer> primeList = new ArrayList<Integer>();

        for(int i = 2; i<=100; i++)
        {
            if(check_prime(i)!=0)
                primeList.add(i);
        }

        return primeList;
    }

    public static ArrayList<Integer> cut_list(ArrayList<Integer>list, int cutPoint)
    {
        ArrayList<Integer> list_ = new ArrayList<>(list);

        for (int i = 0; i <= cutPoint; i++)
        {
            list_.remove(0);
        }
        return list_;
    }

    public static ArrayList<Integer> different(ArrayList<Integer> args)
    {
        ArrayList<Integer> list_ = new ArrayList<>();
        for(int i = 0; i<args.size(); i++)
        {
            int n = args.get(i);
            if(!list_.contains(n))
            {
                list_.add(n);
            }
            else
                return null;
        }
        return list_;
    }

    public static ArrayList<Integer> sum(ArrayList<Integer> numbers)
    {
        numbers = different(numbers);
        int sum_of_num = 0;
        if(numbers != null)
        {
            int COUNT = numbers.size();
            for(int i = 0; i < COUNT; i++){
                sum_of_num += numbers.get(i);
            }
        }
        if(sum_of_num == 100) {
            Collections.sort(numbers);
            return numbers;
        }
        else
            return null;
    }

    public static ArrayList<Integer> array_to_list(int[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i< args.length; i++){
            list.add(args[i]);
        }
        return list;
    }
    public static ArrayList<ArrayList<Integer>> add_numb(ArrayList<Integer> arg, ArrayList<ArrayList<Integer>> collection)
    {
        ArrayList<Integer> n_sum = sum(arg);
        if(n_sum != null)
            if(collection.contains(n_sum) == false)
                collection.add(n_sum);

        return collection;
    }

    public static boolean sum_is_small(int []num)
    {
        int sum_of_num = 0;
        int size = num.length;
        for(int i = 0; i < num.length; i++)
        {
            sum_of_num += num[i];
        }
        if(sum_of_num >100)
            return false;
        else
            return true;
    }
    public static ArrayList<ArrayList<ArrayList<Integer>>> get_num(ArrayList<Integer>primeList)
    {
        ArrayList<ArrayList<Integer>> sum2 = new ArrayList();
        ArrayList<ArrayList<Integer>> sum3 = new ArrayList();
        ArrayList<ArrayList<Integer>> sum4 = new ArrayList();
        ArrayList<ArrayList<Integer>> sum5 = new ArrayList();
        ArrayList<ArrayList<Integer>> sum6 = new ArrayList();
        ArrayList<ArrayList<Integer>> sum7 = new ArrayList();
        ArrayList<ArrayList<Integer>> sum8 = new ArrayList();
        ArrayList<ArrayList<Integer>> sum9 = new ArrayList();

        ArrayList<Integer> a_primes = new ArrayList<>(primeList);
        ArrayList<Integer> b_primes = new ArrayList<>(cut_list(primeList, 0));
        ArrayList<Integer> c_primes = new ArrayList<>(cut_list(primeList, 1));
        ArrayList<Integer> d_primes = new ArrayList<>(cut_list(primeList, 2));
        ArrayList<Integer> e_primes = new ArrayList<>(cut_list(primeList, 3));
        ArrayList<Integer> f_primes = new ArrayList<>(cut_list(primeList, 4));
        ArrayList<Integer> g_primes = new ArrayList<>(cut_list(primeList, 5));
        ArrayList<Integer> h_primes = new ArrayList<>(cut_list(primeList, 6));
        ArrayList<Integer> i_primes = new ArrayList<>(cut_list(primeList, 7));

        for(int a = 0; a < a_primes.size(); a++)
        {
            int a_ = a_primes.get(a);
            for(int b = 0; b < b_primes.size(); b++)
            {
                int b_ = b_primes.get(b);
                int[] a_b = {a_, b_};
                sum2 = add_numb(array_to_list(a_b), sum2);
                if(sum_is_small(a_b))
                {
                    for(int c = 0; c < c_primes.size(); c++)
                    {
                        int c_ = c_primes.get(c);
                        int[] a_b_c = {a_, b_, c_};
                        sum3 = add_numb(array_to_list(a_b_c), sum3);
                        if(sum_is_small(a_b_c))
                        {
                            for(int d = 0; d < d_primes.size(); d++)
                            {
                                int d_ = d_primes.get(d);
                                int[] a_b_c_d = {a_, b_, c_, d_};
                                sum4 = add_numb(array_to_list(a_b_c_d), sum4);
                                if(sum_is_small(a_b_c_d))
                                {
                                    for(int e = 0; e < e_primes.size(); e++)
                                    {
                                        int e_ = e_primes.get(e);
                                        int[] a_b_c_d_e = {a_, b_, c_, d_, e_};
                                        sum5 = add_numb(array_to_list(a_b_c_d_e), sum5);
                                        if(sum_is_small(a_b_c_d_e))
                                        {
                                            for(int f = 0; f < f_primes.size(); f++)
                                            {
                                                int f_ = f_primes.get(f);
                                                int[] a_b_c_d_e_f = {a_, b_, c_, d_, e_, f_};
                                                sum6 = add_numb(array_to_list(a_b_c_d_e_f), sum6);
                                                if(sum_is_small(a_b_c_d_e_f))
                                                {
                                                    for(int g = 0; g < g_primes.size(); g++)
                                                    {
                                                        int g_ = g_primes.get(g);
                                                        int[] a_b_c_d_e_f_g = {a_, b_, c_, d_, e_, f_, g_};
                                                        sum7 = add_numb(array_to_list(a_b_c_d_e_f_g), sum7);
                                                        if(sum_is_small(a_b_c_d_e_f_g))
                                                        {
                                                            for(int h = 0; h < h_primes.size(); h++)
                                                            {
                                                                int h_ = h_primes.get(h);
                                                                int[] a_b_c_d_e_f_g_h = {a_, b_, c_, d_, e_, f_, g_, h_};
                                                                sum8 = add_numb(array_to_list(a_b_c_d_e_f_g_h), sum8);
                                                                if(sum_is_small(a_b_c_d_e_f_g_h))
                                                                {
                                                                    for(int i = 0; i < i_primes.size(); i++)
                                                                    {
                                                                        int i_ = i_primes.get(i);
                                                                        int[] a_b_c_d_e_f_g_h_i = {a_, b_, c_, d_, e_, f_, g_, h_, i_};
                                                                        sum9 = add_numb(array_to_list(a_b_c_d_e_f_g_h_i), sum9);
                                                                    }
                                                                }
                                                                else
                                                                    break;

                                                            }
                                                        }
                                                        else
                                                            break;

                                                    }
                                                }
                                                else
                                                    break;

                                            }
                                        }
                                        else
                                            break;

                                    }
                                }
                                else
                                    break;

                            }
                        }
                        else
                            break;

                    }
                }
                else
                    break;

            }
        }

        ArrayList<ArrayList<ArrayList<Integer>>> result = new ArrayList<>();
        result.add(sum2);
        result.add(sum3);
        result.add(sum4);
        result.add(sum5);
        result.add(sum6);
        result.add(sum7);
        result.add(sum8);
        result.add(sum9);

        return result;
    }
    public static void main(String[] args) {

        for(int i = 0; i <8; i++) {
            System.out.println(get_num(get_primes()).get(i));
            System.out.println();
        }
    }
}