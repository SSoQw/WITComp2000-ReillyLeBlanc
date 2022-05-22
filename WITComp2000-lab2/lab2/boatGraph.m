%script to generate the various distance over time graphs as efficiency
%and speed are varried

fuel = 5;
stepsE = linspace(.001,.01,9); %Range of efficiecny
stepsS = 1:1:55; %Range of speeds
time = zeros(55,9); %2D array to hold how long it takes fuel to be emptied

for i=1:9
    for j=1:55
            maxTime = (fuel/(stepsE(i)*(stepsS(j)^2)));
            time(j,i) = maxTime;
    end
end



tiledlayout(3,3)

nexttile
title('Engine Efficiecny: 0.0010 | Speed: 1-55 mph')
xlabel("Distance")
ylabel("Time")
hold on

hold off

nexttile
title('Engine Efficiecny: 0.0021 | Speed: 1-55 mph')
xlabel("Distance")
ylabel("Time")
hold on

hold off

nexttile
title('Engine Efficiecny: 0.0033 | Speed: 1-55 mph')
xlabel("Distance")
ylabel("Time")
hold on

hold off

nexttile
title('Engine Efficiecny: 0.0044 | Speed: 1-55 mph')
xlabel("Distance")
ylabel("Time")
hold on

hold off

nexttile
title('Engine Efficiecny: 0.0055 | Speed: 1-55 mph')
xlabel("Distance")
ylabel("Time")
hold on

hold off

nexttile
title('Engine Efficiecny: 0.0066 | Speed: 1-55 mph')
xlabel("Distance")
ylabel("Time")
hold on

hold off

nexttile
title('Engine Efficiecny: 0.0078 | Speed: 1-55 mph')
xlabel("Distance")
ylabel("Time")
hold on

hold off

nexttile
title('Engine Efficiecny: 0.0089 | Speed: 1-55 mph')
xlabel("Distance")
ylabel("Time")
hold on

hold off

nexttile
title('Engine Efficiecny: 0.0100 | Speed: 1-55 mph')
xlabel("Distance")
ylabel("Time")
hold on

hold off