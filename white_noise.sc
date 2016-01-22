// Slow cycles of white noise. Sounds like the ocean.

{
	WhiteNoise.ar(
	mul: SinOsc.kr(0.125).range(0, 0.25))
}.play;

{
	BrownNoise.ar(
	mul: SinOsc.kr(0.25).range(0, 0.25))
}.play;

{
	PinkNoise.ar(
	mul: SinOsc.kr(0.0625).range(0, 0.25))
}.play;


// Fast cycles. Sounds like a steam engine.

{
	WhiteNoise.ar(
	mul: SinOsc.kr(1).range(0, 0.20))
}.play;

{
	
	BrownNoise.ar(
	mul: SinOsc.kr(2).range(0, 0.40))
}.play;

{
	PinkNoise.ar(
	mul: SinOsc.kr(0.0625).range(0, 0.25))
}.play;
		
