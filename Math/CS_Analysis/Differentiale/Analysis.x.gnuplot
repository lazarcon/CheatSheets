set table "Analysis.x.table"; set format "%.5f"
set samples 25; plot [x=-0.2:3.5] (x*x*x)/3 - 2*x*x + 3*x
