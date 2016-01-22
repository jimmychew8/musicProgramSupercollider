// Low, fast, discrete swells

{
	SinOsc.ar(
		freq: SinOsc.kr(1).range(100, 200),
		mul: SinOsc.kr(10).range(0, 1).poll)
	
}.play;

{
	SinOsc.ar(
		freq: SinOsc.kr(1).range(100, 200),
		mul: SinOsc.kr(100).range(0, 1))
	
}.play;
