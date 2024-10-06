import cv2
import matplotlib.pyplot as plt

img = cv2.imread('/Users/kevinsathyanath/Desktop/DL.jpg')

edges = cv2.Canny(img, 100, 200, 3, L2gradient=True)
#plt.figure()
# plt.title('Image')
# plt.imsave("edge.jpg", edges, cmap = 'gray', format='jpg' )
# plt.imshow(edges, cmap = 'gray')
# plt.show()

cv2.imshow('edges', edges)
cv2.waitKey(0)
cv2.destroyAllWindows()