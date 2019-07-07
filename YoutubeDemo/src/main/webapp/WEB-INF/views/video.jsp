<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<header class="header" role="banner">
  <h1>Flexbox YouTube Thumbnail Grid</h1>
</header>
<main role="main">
  <article>
    <p>Responsive flexbox unordered list grid of YouTube video thumbnails with Fancybox links. Uses a 9kb image with a 16:9 aspect ratio to be able to use the YouTube thumbnails as a background image, without seeing those black letterbox bars at the top and bottom. This also makes the video thumbnails fluid when resizing the browser.</p>
  </article>
  <section class="videos" id="featured-videos">
    <div class="video-grid front-page" id="front-page-videos">
      <ul class="video-list featured">
      	<c:forEach item="${videoList}" var="video">
      		<li class="video featured">
	          <a data-fancybox href="https://www.youtube.com/embed/Zq6Crtglztk?autoplay=1&controls=0&showinfo=0&color=white&rel=0" class="featured-video">
	            <figure style="background-image: url(https://img.youtube.com/vi/Zq6Crtglztk/hqdefault.jpg);">
	              <img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/50598/video-thumb-placeholder-16-9.png" />
	              <figcaption>Swap-Meet Speed for Roadkill Nights</figcaption>
	            </figure>
	          </a>
	        </li>
      	</c:forEach>
      	
        <li class="video featured">
          <a data-fancybox href="https://www.youtube.com/embed/Zq6Crtglztk?autoplay=1&controls=0&showinfo=0&color=white&rel=0" class="featured-video">
            <figure style="background-image: url(https://img.youtube.com/vi/Zq6Crtglztk/hqdefault.jpg);">
              <img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/50598/video-thumb-placeholder-16-9.png" />
              <figcaption>Swap-Meet Speed for Roadkill Nights</figcaption>
            </figure>
          </a>
        </li>
        <li class="video featured">
          <a data-fancybox href="https://www.youtube.com/embed/qDK86kzgUPg?autoplay=1&controls=0&showinfo=0&color=white&rel=0" class="featured-video">
            <figure style="background-image: url(https://img.youtube.com/vi/qDK86kzgUPg/hqdefault.jpg);">
              <img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/50598/video-thumb-placeholder-16-9.png" />
              <figcaption>Cummins Diesel in a Cadillac</figcaption>
            </figure>
          </a>
        </li>
        <li class="video featured">
          <a data-fancybox href="https://www.youtube.com/embed/uSB2_428P2w?autoplay=1&controls=0&showinfo=0&color=white&rel=0" class="featured-video">
            <figure style="background-image: url(https://img.youtube.com/vi/uSB2_428P2w/hqdefault.jpg);">
              <img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/50598/video-thumb-placeholder-16-9.png" />
              <figcaption>Dirt-Track Challenger Rescue and Thrash</figcaption>
            </figure>
          </a>
        </li>
        <li class="video featured">
          <a data-fancybox href="https://www.youtube.com/embed/pOhl6oVpEes?autoplay=1&controls=0&showinfo=0&color=white&rel=0" class="featured-video">
            <figure style="background-image: url(https://img.youtube.com/vi/pOhl6oVpEes/hqdefault.jpg);">
              <img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/50598/video-thumb-placeholder-16-9.png" />
              <figcaption>Junkyard 1956 Buick Hack</figcaption>
            </figure>
          </a>
        </li>
        <li class="video featured">
          <a data-fancybox href="https://www.youtube.com/embed/PVs_xZ46Cxw?autoplay=1&controls=0&showinfo=0&color=white&rel=0" class="featured-video">
            <figure style="background-image: url(https://img.youtube.com/vi/PVs_xZ46Cxw/hqdefault.jpg);">
              <img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/50598/video-thumb-placeholder-16-9.png" />
              <figcaption>Wheelstanding Dump Truck! Stubby Bob’s Comeback</figcaption>
            </figure>
          </a>
        </li>
        <li class="video featured">
          <a data-fancybox href="https://www.youtube.com/embed/C4jk51rgfts?autoplay=1&controls=0&showinfo=0&color=white&rel=0" class="featured-video">
            <figure style="background-image: url(https://img.youtube.com/vi/C4jk51rgfts/hqdefault.jpg);">
              <img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/50598/video-thumb-placeholder-16-9.png" />
              <figcaption>Will It Go 10s? Mazdarati Is Back!</figcaption>
            </figure>
          </a>
        </li>
      </ul>
    </div
  </section>
</main>