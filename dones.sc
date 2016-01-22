{
	SinOsc.ar(
		note: Pseq([-0.5, -0.25, 0, 0.25, 0.5, 3, 4.5, 4.75, 5, 5.25, 5.5]),
		mul: SinOsc.kr(0.5).range(0, 1))
	
}.play;

{
	Pulse.ar(
		note: Pseq([-0.5, -0.25, 0, 0.25, 0.5, 3, 4.5, 4.75, 5, 5.25, 5.5]),
		mul: SinOsc.kr(0.125).range(0, 0.25))
	
}.play;

{
	Pulse.ar(
		note: Pseq([-0.5, -0.25, 0, 0.25, 0.5, 3, 4.5, 4.75, 5, 5.25, 5.5]),
		mul: SinOsc.kr(0.25).range(0, 0.5))
	
}.play;
