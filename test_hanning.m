function test_hanning(n)
    x = load('han.dat');
    y = hanning(n);
    plot(y);
    hold on;
    plot(x);
end