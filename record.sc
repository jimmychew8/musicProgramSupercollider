// Recording from a microphone.
// Check post window for path of recording.

(
s.record;
{
	SoundIn.ar([0,1])
}.play;

s.stopRecording;
s.makeWindow;
)

