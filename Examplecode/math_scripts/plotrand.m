% ������������� ��������� ������, ����������.
% ���������� �������
n = 50;             % 50 �����
r = rand (n, 1);
plot(r)
m = mean(r);
hold on
% ���������� ���� �� (0, m) �� (m, m)
plot([0,n],[m,m])
hold off
title('Mean of Random Uniform Data')