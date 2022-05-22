%script to generate the various distance over time graphs as efficiency
%and speed are varried
stepsS = 10:1:55; %Range of speeds

TotalSpeeds = size(stepsS,2);
timeForGraph = zeros(TotalSpeeds,1000); %Used to hold time that will be used
%to plot distacne over time

distance = zeros(TotalSpeeds,1000); %Used to hold distance traveled

fuel = 5; %amount of fuel present

stepsE = linspace(.001,.01,9); %Range of efficiecny

time = zeros(TotalSpeeds,9); %2D array to hold how long it takes fuel to be emptied

for i=1:9
    for j=1:TotalSpeeds
            maxTime = (fuel/(stepsE(i)*(stepsS(j)^2)));
            time(j,i) = maxTime;
    end
end


plotnum = 1;
tiledlayout(2,2)

%%%%%%%%%%%%%%%%%%%%%%plot%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
nexttile
title('Engine Efficiecny: 0.0010 | Speeds: 10-55 mph')
xlabel("Distance: Miles")
ylabel("Time: Hours")
hold on 
for i=1:TotalSpeeds
    timeForGraph(i,:) = linspace(0,time(i,plotnum),1000); 
end

for j=1:TotalSpeeds
    for k=1:1000
        distance(j,k)=timeForGraph(j,k)*j;
    end
end



for a=1:TotalSpeeds
    plot(distance(a,:),timeForGraph(a,:))
end


%legendStrings = string(stepsS) + " MPH";
%legend(legendStrings)

plotnum = plotnum + 1;
hold off

%%%%%%%%%%%%%%%%%%%%%%plot%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
nexttile
title('Engine Efficiecny: 0.0021 | Speeds: 10-55 mph')
xlabel("Distance: Miles")
ylabel("Time: Hours")
hold on
for i=1:TotalSpeeds
    timeForGraph(i,:) = linspace(0,time(i,plotnum),1000); 
end

for j=1:TotalSpeeds
    for k=1:1000
        distance(j,k)=timeForGraph(j,k)*j;
    end
end

for a=1:TotalSpeeds
    plot(distance(a,:),timeForGraph(a,:))
   
end
plotnum = plotnum + 6;
hold off
%%%%%%%%%%%%%%%%%%%%%%plot%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
nexttile
title('Engine Efficiecny: 0.0089 | Speeds: 10-55 mph')
xlabel("Distance: Miles")
ylabel("Time: Hours")
hold on
for i=1:TotalSpeeds
    timeForGraph(i,:) = linspace(0,time(i,plotnum),1000); 
end

for j=1:TotalSpeeds
    for k=1:1000
        distance(j,k)=timeForGraph(j,k)*j;
    end
end

for a=1:TotalSpeeds
    plot(distance(a,:),timeForGraph(a,:))
   
end
plotnum = plotnum + 1;
hold off

%%%%%%%%%%%%%%%%%%%%%%plot%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
nexttile
title('Engine Efficiecny: 0.0100 | Speeds: 10-55 mph')
xlabel("Distance: Miles")
ylabel("Time: Hours")
hold on
for i=1:TotalSpeeds
    timeForGraph(i,:) = linspace(0,time(i,plotnum),1000); 
end

for j=1:TotalSpeeds
    for k=1:1000
        distance(j,k)=timeForGraph(j,k)*j;
    end
end

for a=1:TotalSpeeds
    plot(distance(a,:),timeForGraph(a,:))
   
end
plotnum = plotnum + 1;
hold off