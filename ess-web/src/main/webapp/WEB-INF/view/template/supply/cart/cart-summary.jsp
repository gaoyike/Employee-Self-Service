<div style="padding-top: 13px; width: 100px">
  <div class="col-6-12">
    <svg version="1.1"  class="" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" width="30px" height="30px" xml:space="preserve">
			<path style="fill: white" d="M27.715,10.48l-2.938,6.312c-0.082,0.264-0.477,0.968-1.318,0.968H11.831
				c-0.89,0-1.479-0.638-1.602-0.904l-2.048-6.524C7.629,8.514,8.715,7.933,9.462,7.933c0.748,0,14.915,0,16.805,0
				C27.947,7.933,28.17,9.389,27.715,10.48L27.715,10.48z M9.736,9.619c0.01,0.061,0.026,0.137,0.056,0.226l1.742,6.208
				c0.026,0.017,0.058,0.028,0.089,0.028h11.629l2.92-6.27c0.025-0.073,0.045-0.137,0.053-0.192H9.736L9.736,9.619z M13.544,25.534
				c-0.819,0-1.482-0.662-1.482-1.482s0.663-1.484,1.482-1.484c0.824,0,1.486,0.664,1.486,1.484S14.369,25.534,13.544,25.534
				L13.544,25.534z M23.375,25.534c-0.82,0-1.482-0.662-1.482-1.482s0.662-1.484,1.482-1.484c0.822,0,1.486,0.664,1.486,1.484
				S24.197,25.534,23.375,25.534L23.375,25.534z M24.576,21.575H13.965c-2.274,0-3.179-2.151-3.219-2.244
				c-0.012-0.024-0.021-0.053-0.028-0.076c0,0-3.56-12.118-3.834-13.05c-0.26-0.881-0.477-1.007-1.146-1.007H2.9
				c-0.455,0-0.82-0.364-0.82-0.818s0.365-0.82,0.82-0.82h2.841c1.827,0,2.4,1.103,2.715,2.181
				c0.264,0.898,3.569,12.146,3.821,12.999c0.087,0.188,0.611,1.197,1.688,1.197h10.611c0.451,0,0.818,0.368,0.818,0.818
				C25.395,21.21,25.027,21.575,24.576,21.575L24.576,21.575z"/>
</svg>
  </div>
  <div class="col-6-12" style="color:white">{{getTotalItems()}}
    <ng-pluralize count="getTotalItems()" when="{1: 'item', 'other':'items'}"></ng-pluralize>
  </div>
</div>