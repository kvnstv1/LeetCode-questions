import cv2 as cv
import matplotlib.pyplot as plt

img1 = cv.imread("/Users/kevinsathyanath/Desktop/DL.jpg")
height, width = img1.shape[:2]

img2 = cv.imread("/Users/kevinsathyanath/Desktop/MB.jpg")
img2 = cv.resize(img2, (width, height))

assert img1 is not None, "File not found."
assert img2 is not None, "File not found."

dst = cv.addWeighted(img1, 0.8, img2, 0.2, 0.0)

cv.imshow('dst', dst)
cv.waitKey(0)
cv.destroyAllWindows()