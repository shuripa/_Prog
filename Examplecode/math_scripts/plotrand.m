% Генерирование случайных данных, вычисление.
% Построение графика
n = 50;             % 50 точек
r = rand (n, 1);
plot(r)
m = mean(r);
hold on
% Построение лини от (0, m) до (m, m)
plot([0,n],[m,m])
hold off
title('Mean of Random Uniform Data')