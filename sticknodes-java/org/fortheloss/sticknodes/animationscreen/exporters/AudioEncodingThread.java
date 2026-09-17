package org.fortheloss.sticknodes.animationscreen.exporters;

/* loaded from: classes2.dex */
public class AudioEncodingThread extends java.lang.Thread implements com.badlogic.gdx.utils.Disposable {
    private volatile java.io.File _aacFile;
    private volatile int _audioEventsIter;
    private volatile java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.AudioEvent> _audioEventsRef;
    private volatile int _frameIndex;
    private volatile boolean _isAlive;
    private volatile boolean _isCancelled;
    private volatile boolean _isFinishedEncodingAudio;
    private boolean _isOkay;
    private volatile boolean _isReadyForMoreAudio;
    private java.lang.Object _lockObject;
    private int _mode;
    private volatile java.io.File _mp3FileToEncode;
    private volatile java.io.File _outputFile;
    private volatile java.lang.String _projectName;
    private volatile int _result;
    private volatile float _soundPan;
    private volatile float _soundPitch;
    private volatile float _soundVolume;
    private volatile java.io.File _videoFile;
    private volatile int _waveHeaderLength;
    private volatile java.io.File _waveOutputFile;
    private volatile java.io.RandomAccessFile _waveOutputRandomAccessFile;
    private volatile float _waveSamplePerFrame;
    private volatile int _waveTotalBytes;

    public AudioEncodingThread(java.lang.String r4, int r5, int r6) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3._frameIndex = r0
            r1 = 0
            r3._soundVolume = r1
            r3._soundPan = r1
            r2 = 1065353216(0x3f800000, float:1.0)
            r3._soundPitch = r2
            r3._waveSamplePerFrame = r1
            r3._waveHeaderLength = r0
            r3._waveTotalBytes = r0
            r1 = 1
            r3._isAlive = r1
            r3._isReadyForMoreAudio = r1
            r3._isCancelled = r0
            r3._isFinishedEncodingAudio = r0
            r3._result = r0
            r3._audioEventsIter = r0
            r3._isOkay = r1
            r3._mode = r0
            r3._projectName = r4
            boolean r4 = r3.createOutputWAVEFile(r5, r6)
            r3._isOkay = r4
            java.io.PrintStream r5 = java.lang.System.out
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "AudioEncodingThread: Starting the thread, is okay: "
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = "."
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.println(r4)
            boolean r4 = r3._isOkay
            if (r4 == 0) goto L57
            java.lang.Object r4 = new java.lang.Object
            r4.<init>()
            r3._lockObject = r4
            r3.start()
        L57:
            return
    }

    private boolean createOutputWAVEFile(int r12, int r13) {
            r11 = this;
            java.lang.String r0 = " bytes."
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r2 = "AudioEncodingThread: Creating the output WAVE file."
            r1.println(r2)
            com.badlogic.gdx.Files r1 = com.badlogic.gdx.Gdx.files
            java.lang.String r2 = org.fortheloss.sticknodes.App.tempPath
            java.lang.String r3 = r11._projectName
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = "_audio_wav.wav"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.badlogic.gdx.files.FileHandle r1 = r1.absolute(r2)
            java.io.File r1 = r1.file()
            r11._waveOutputFile = r1
            java.io.File r1 = r11._waveOutputFile
            boolean r1 = r1.exists()
            if (r1 == 0) goto L3a
            java.io.File r1 = r11._waveOutputFile
            r1.delete()
        L3a:
            r1 = 0
            r2 = 0
            java.io.File r3 = r11._waveOutputFile     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf3
            r3.createNewFile()     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf3
            float r3 = (float) r13     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf3
            float r4 = (float) r12     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf3
            float r5 = r3 / r4
            r6 = 44100(0xac44, float:6.1797E-41)
            float r6 = (float) r6     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf3
            float r6 = r6 / r4
            r4 = 2
            float r7 = (float) r4     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf3
            float r6 = r6 * r7
            r11._waveSamplePerFrame = r6     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf3
            float r6 = r11._waveSamplePerFrame     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf3
            float r6 = r6 * r3
            int r3 = (int) r6     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf3
            int r3 = r3 * 2
            r11._waveTotalBytes = r3     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf3
            java.io.PrintStream r3 = java.lang.System.out     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf3
            int r6 = r11._waveTotalBytes     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf3
            r7.<init>()     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf3
            java.lang.String r8 = "AudioEncodingThread: Frame count is "
            r7.append(r8)     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf3
            r7.append(r13)     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf3
            java.lang.String r13 = " at "
            r7.append(r13)     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf3
            r7.append(r12)     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf3
            java.lang.String r12 = " fps for a duration of "
            r7.append(r12)     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf3
            r7.append(r5)     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf3
            java.lang.String r12 = " seconds creating an audio file of size "
            r7.append(r12)     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf3
            r7.append(r6)     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf3
            r7.append(r0)     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf3
            java.lang.String r12 = r7.toString()     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf3
            r3.println(r12)     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf3
            java.io.FileOutputStream r12 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf3
            java.io.File r13 = r11._waveOutputFile     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf3
            r12.<init>(r13)     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf3
            java.io.BufferedOutputStream r13 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf3
            r3 = 1024(0x400, float:1.435E-42)
            r13.<init>(r12, r3)     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf3
            java.io.PrintStream r1 = java.lang.System.out     // Catch: java.lang.Throwable -> Leb java.io.IOException -> Lee
            java.lang.String r3 = "AudioEncodingThread: Writing the header to the output WAVE file."
            r1.println(r3)     // Catch: java.lang.Throwable -> Leb java.io.IOException -> Lee
            org.fortheloss.sticknodes.WaveHeader r1 = new org.fortheloss.sticknodes.WaveHeader     // Catch: java.lang.Throwable -> Leb java.io.IOException -> Lee
            r6 = 1
            short r7 = (short) r4     // Catch: java.lang.Throwable -> Leb java.io.IOException -> Lee
            r9 = 16
            int r10 = r11._waveTotalBytes     // Catch: java.lang.Throwable -> Leb java.io.IOException -> Lee
            r8 = 44100(0xac44, float:6.1797E-41)
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Leb java.io.IOException -> Lee
            int r12 = r1.write(r12)     // Catch: java.lang.Throwable -> Leb java.io.IOException -> Lee
            r11._waveHeaderLength = r12     // Catch: java.lang.Throwable -> Leb java.io.IOException -> Lee
            java.io.PrintStream r12 = java.lang.System.out     // Catch: java.lang.Throwable -> Leb java.io.IOException -> Lee
            int r1 = r11._waveHeaderLength     // Catch: java.lang.Throwable -> Leb java.io.IOException -> Lee
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Leb java.io.IOException -> Lee
            r3.<init>()     // Catch: java.lang.Throwable -> Leb java.io.IOException -> Lee
            java.lang.String r4 = "AudioEncodingThread: Output WAVE file header length is "
            r3.append(r4)     // Catch: java.lang.Throwable -> Leb java.io.IOException -> Lee
            r3.append(r1)     // Catch: java.lang.Throwable -> Leb java.io.IOException -> Lee
            r3.append(r0)     // Catch: java.lang.Throwable -> Leb java.io.IOException -> Lee
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> Leb java.io.IOException -> Lee
            r12.println(r0)     // Catch: java.lang.Throwable -> Leb java.io.IOException -> Lee
            java.io.PrintStream r12 = java.lang.System.out     // Catch: java.lang.Throwable -> Leb java.io.IOException -> Lee
            java.lang.String r0 = "AudioEncodingThread: Writing silence to the output WAVE file."
            r12.println(r0)     // Catch: java.lang.Throwable -> Leb java.io.IOException -> Lee
            r12 = 0
        Ld9:
            int r0 = r11._waveTotalBytes     // Catch: java.lang.Throwable -> Leb java.io.IOException -> Lee
            if (r12 >= r0) goto Le3
            r13.write(r2)     // Catch: java.lang.Throwable -> Leb java.io.IOException -> Lee
            int r12 = r12 + 1
            goto Ld9
        Le3:
            r13.flush()     // Catch: java.lang.Throwable -> Leb java.io.IOException -> Lee
            r13.close()     // Catch: java.io.IOException -> Le9
        Le9:
            r12 = 1
            goto L104
        Leb:
            r12 = move-exception
            r1 = r13
            goto L129
        Lee:
            r12 = move-exception
            r1 = r13
            goto Lf4
        Lf1:
            r12 = move-exception
            goto L129
        Lf3:
            r12 = move-exception
        Lf4:
            java.io.PrintStream r13 = java.lang.System.out     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r0 = "AudioEncodingThread: Failed to create the output WAVE file."
            r13.println(r0)     // Catch: java.lang.Throwable -> Lf1
            r12.printStackTrace()     // Catch: java.lang.Throwable -> Lf1
            if (r1 == 0) goto L103
            r1.close()     // Catch: java.io.IOException -> L103
        L103:
            r12 = 0
        L104:
            if (r12 != 0) goto L107
            return r2
        L107:
            java.io.RandomAccessFile r13 = new java.io.RandomAccessFile     // Catch: java.io.FileNotFoundException -> L114
            java.io.File r0 = r11._waveOutputFile     // Catch: java.io.FileNotFoundException -> L114
            java.lang.String r1 = "rw"
            r13.<init>(r0, r1)     // Catch: java.io.FileNotFoundException -> L114
            r11._waveOutputRandomAccessFile = r13     // Catch: java.io.FileNotFoundException -> L114
            r2 = r12
            goto L128
        L114:
            r12 = move-exception
            java.io.PrintStream r13 = java.lang.System.out
            java.lang.String r0 = "AudioEncodingThread: Failed to create the output stream for the output WAVE file."
            r13.println(r0)
            r12.printStackTrace()
            java.io.RandomAccessFile r12 = r11._waveOutputRandomAccessFile
            if (r12 == 0) goto L128
            java.io.RandomAccessFile r12 = r11._waveOutputRandomAccessFile     // Catch: java.io.IOException -> L128
            r12.close()     // Catch: java.io.IOException -> L128
        L128:
            return r2
        L129:
            if (r1 == 0) goto L12e
            r1.close()     // Catch: java.io.IOException -> L12e
        L12e:
            throw r12
    }

    private synchronized void processNextAudioEvent() {
            r3 = this;
            monitor-enter(r3)
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = "AudioEncodingThread: [Processing next event]"
            r0.println(r1)     // Catch: java.lang.Throwable -> L3c
            int r0 = r3._audioEventsIter     // Catch: java.lang.Throwable -> L3c
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.AudioEvent> r1 = r3._audioEventsRef     // Catch: java.lang.Throwable -> L3c
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L3c
            if (r0 < r1) goto L19
            r0 = 0
            r3._mode = r0     // Catch: java.lang.Throwable -> L3c
            r0 = 1
            r3._isReadyForMoreAudio = r0     // Catch: java.lang.Throwable -> L3c
            goto L3a
        L19:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.AudioEvent> r0 = r3._audioEventsRef     // Catch: java.lang.Throwable -> L3c
            int r1 = r3._audioEventsIter     // Catch: java.lang.Throwable -> L3c
            int r2 = r1 + 1
            r3._audioEventsIter = r2     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L3c
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.AudioEvent r0 = (org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.AudioEvent) r0     // Catch: java.lang.Throwable -> L3c
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.FrameApplySilenceEvent     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L31
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.FrameApplySilenceEvent r0 = (org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.FrameApplySilenceEvent) r0     // Catch: java.lang.Throwable -> L3c
            r3.applySilence(r0)     // Catch: java.lang.Throwable -> L3c
            goto L3a
        L31:
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.FramePlaySoundEvent     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L3a
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.FramePlaySoundEvent r0 = (org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.FramePlaySoundEvent) r0     // Catch: java.lang.Throwable -> L3c
            r3.encodeAudio(r0)     // Catch: java.lang.Throwable -> L3c
        L3a:
            monitor-exit(r3)
            return
        L3c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    public synchronized void applySilence(org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.FrameApplySilenceEvent r3) {
            r2 = this;
            monitor-enter(r2)
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "AudioEncodingThread: Received request to apply silence..."
            r0.println(r1)     // Catch: java.lang.Throwable -> L14
            r0 = 0
            r2._isReadyForMoreAudio = r0     // Catch: java.lang.Throwable -> L14
            int r3 = r3.silenceStartFrameIndex     // Catch: java.lang.Throwable -> L14
            r2._frameIndex = r3     // Catch: java.lang.Throwable -> L14
            r3 = 3
            r2._mode = r3     // Catch: java.lang.Throwable -> L14
            monitor-exit(r2)
            return
        L14:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public void cancelAudioEncoding() {
            r2 = this;
            boolean r0 = r2._isCancelled
            if (r0 == 0) goto L5
            return
        L5:
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "AudioEncodingThread: Calling cancel()..."
            r0.println(r1)
            java.io.RandomAccessFile r0 = r2._waveOutputRandomAccessFile
            if (r0 == 0) goto L15
            java.io.RandomAccessFile r0 = r2._waveOutputRandomAccessFile     // Catch: java.io.IOException -> L15
            r0.close()     // Catch: java.io.IOException -> L15
        L15:
            r0 = 0
            r2._isReadyForMoreAudio = r0
            r0 = 1
            r2._isCancelled = r0
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._isAlive = r0
            return
    }

    public synchronized void encodeAudio(org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.FramePlaySoundEvent r3) {
            r2 = this;
            monitor-enter(r2)
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "AudioEncodingThread: Received MP3 audio file..."
            r0.println(r1)     // Catch: java.lang.Throwable -> L24
            r0 = 0
            r2._isReadyForMoreAudio = r0     // Catch: java.lang.Throwable -> L24
            int r0 = r3.soundFrameIndex     // Catch: java.lang.Throwable -> L24
            r2._frameIndex = r0     // Catch: java.lang.Throwable -> L24
            java.io.File r0 = r3.mp3FileToEncode     // Catch: java.lang.Throwable -> L24
            r2._mp3FileToEncode = r0     // Catch: java.lang.Throwable -> L24
            float r0 = r3.soundVolume     // Catch: java.lang.Throwable -> L24
            r2._soundVolume = r0     // Catch: java.lang.Throwable -> L24
            float r0 = r3.soundPan     // Catch: java.lang.Throwable -> L24
            r2._soundPan = r0     // Catch: java.lang.Throwable -> L24
            float r3 = r3.soundPitch     // Catch: java.lang.Throwable -> L24
            r2._soundPitch = r3     // Catch: java.lang.Throwable -> L24
            r3 = 1
            r2._mode = r3     // Catch: java.lang.Throwable -> L24
            monitor-exit(r2)
            return
        L24:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public void finishAudioEncoding(java.io.File r5) {
            r4 = this;
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "AudioEncodingThread: Going to encode to AAC and mux..."
            r0.println(r1)
            r0 = 0
            r4._isReadyForMoreAudio = r0
            java.io.RandomAccessFile r0 = r4._waveOutputRandomAccessFile
            if (r0 == 0) goto L15
            java.io.RandomAccessFile r0 = r4._waveOutputRandomAccessFile     // Catch: java.io.IOException -> L14
            r0.close()     // Catch: java.io.IOException -> L14
            goto L15
        L14:
        L15:
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.lang.String r1 = org.fortheloss.sticknodes.App.tempPath
            java.lang.String r2 = r4._projectName
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = "_audio_aac.aac"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r1)
            java.io.File r0 = r0.file()
            r4._aacFile = r0
            java.io.File r0 = r4._aacFile
            boolean r0 = r0.exists()
            if (r0 == 0) goto L46
            java.io.File r0 = r4._aacFile
            r0.delete()
        L46:
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.lang.String r1 = org.fortheloss.sticknodes.App.exportsPath
            java.lang.String r2 = r4._projectName
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = ".mp4"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r1)
            java.io.File r0 = r0.file()
            r4._outputFile = r0
            java.io.File r0 = r4._outputFile
            boolean r0 = r0.exists()
            if (r0 == 0) goto L77
            java.io.File r0 = r4._outputFile
            r0.delete()
        L77:
            r4._videoFile = r5
            r5 = 2
            r4._mode = r5
            return
    }

    public boolean isCancelled() {
            r1 = this;
            boolean r0 = r1._isCancelled
            return r0
    }

    public int isFinishedEncodingAudio() {
            r1 = this;
            boolean r0 = r1._isFinishedEncodingAudio
            if (r0 == 0) goto L7
            int r0 = r1._result
            return r0
        L7:
            r0 = 0
            return r0
    }

    public boolean isOkay() {
            r1 = this;
            boolean r0 = r1._isOkay
            return r0
    }

    public boolean isReady() {
            r1 = this;
            boolean r0 = r1._isReadyForMoreAudio
            return r0
    }

    public synchronized void processAudioEvents(java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.AudioEvent> r5) {
            r4 = this;
            monitor-enter(r4)
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L2c
            int r1 = r5.size()     // Catch: java.lang.Throwable -> L2c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r2.<init>()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = "AudioEncodingThread: Received more audio events ("
            r2.append(r3)     // Catch: java.lang.Throwable -> L2c
            r2.append(r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = ")..."
            r2.append(r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L2c
            r0.println(r1)     // Catch: java.lang.Throwable -> L2c
            r0 = 0
            r4._isReadyForMoreAudio = r0     // Catch: java.lang.Throwable -> L2c
            r4._audioEventsRef = r5     // Catch: java.lang.Throwable -> L2c
            r4._audioEventsIter = r0     // Catch: java.lang.Throwable -> L2c
            r4.processNextAudioEvent()     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r4)
            return
        L2c:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
            r16 = this;
            r1 = r16
        L2:
            boolean r0 = r1._isAlive
            if (r0 == 0) goto L412
            boolean r0 = r1._isCancelled
            if (r0 != 0) goto L2
            int r0 = r1._mode
            r3 = 3
            r4 = 2
            if (r0 != r3) goto L42
            java.lang.Object r3 = r1._lockObject
            monitor-enter(r3)
            int r0 = r1._waveHeaderLength     // Catch: java.lang.Throwable -> L3f
            int r2 = r1._frameIndex     // Catch: java.lang.Throwable -> L3f
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L3f
            float r5 = r1._waveSamplePerFrame     // Catch: java.lang.Throwable -> L3f
            float r2 = r2 * r5
            int r2 = (int) r2
            int r2 = r2 * 2
            int r0 = r0 + r2
            java.io.RandomAccessFile r2 = r1._waveOutputRandomAccessFile     // Catch: java.io.IOException -> L36 java.lang.Throwable -> L3f
            long r4 = r2.length()     // Catch: java.io.IOException -> L36 java.lang.Throwable -> L3f
            java.io.RandomAccessFile r2 = r1._waveOutputRandomAccessFile     // Catch: java.io.IOException -> L36 java.lang.Throwable -> L3f
            long r6 = (long) r0     // Catch: java.io.IOException -> L36 java.lang.Throwable -> L3f
            r2.seek(r6)     // Catch: java.io.IOException -> L36 java.lang.Throwable -> L3f
            java.io.RandomAccessFile r2 = r1._waveOutputRandomAccessFile     // Catch: java.io.IOException -> L36 java.lang.Throwable -> L3f
            int r5 = (int) r4     // Catch: java.io.IOException -> L36 java.lang.Throwable -> L3f
            int r5 = r5 - r0
            byte[] r0 = new byte[r5]     // Catch: java.io.IOException -> L36 java.lang.Throwable -> L3f
            r2.write(r0)     // Catch: java.io.IOException -> L36 java.lang.Throwable -> L3f
            goto L3a
        L36:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L3f
        L3a:
            r16.processNextAudioEvent()     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3f
            goto L2
        L3f:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3f
            throw r0
        L42:
            r3 = 0
            r5 = 1
            if (r0 != r5) goto L305
            java.lang.Object r6 = r1._lockObject
            monitor-enter(r6)
            java.io.File r0 = r1._mp3FileToEncode     // Catch: java.lang.Throwable -> L302
            if (r0 == 0) goto L2ff
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L302
            java.lang.String r7 = "AudioEncodingThread: Converting MP3 file to raw PCM."
            r0.println(r7)     // Catch: java.lang.Throwable -> L302
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files     // Catch: java.lang.Throwable -> L302
            java.lang.String r7 = org.fortheloss.sticknodes.App.tempPath     // Catch: java.lang.Throwable -> L302
            java.io.File r8 = r1._mp3FileToEncode     // Catch: java.lang.Throwable -> L302
            java.lang.String r8 = r8.getName()     // Catch: java.lang.Throwable -> L302
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L302
            r9.<init>()     // Catch: java.lang.Throwable -> L302
            r9.append(r7)     // Catch: java.lang.Throwable -> L302
            r9.append(r8)     // Catch: java.lang.Throwable -> L302
            java.lang.String r7 = "_converted_to_pcm.raw"
            r9.append(r7)     // Catch: java.lang.Throwable -> L302
            java.lang.String r7 = r9.toString()     // Catch: java.lang.Throwable -> L302
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r7)     // Catch: java.lang.Throwable -> L302
            java.io.File r0 = r0.file()     // Catch: java.lang.Throwable -> L302
            boolean r7 = r0.exists()     // Catch: java.lang.Throwable -> L302
            if (r7 == 0) goto L83
            r0.delete()     // Catch: java.lang.Throwable -> L302
        L83:
            r7 = 1194083328(0x472c4400, float:44100.0)
            float r8 = r1._soundPitch     // Catch: java.lang.Throwable -> L302
            float r7 = r7 / r8
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L302
            int r8 = r7 % 2
            if (r8 == 0) goto L90
            int r7 = r7 + 1
        L90:
            r8 = 22050(0x5622, float:3.0899E-41)
            r9 = 88200(0x15888, float:1.23595E-40)
            if (r7 <= r9) goto L9b
            r7 = 88200(0x15888, float:1.23595E-40)
            goto L9f
        L9b:
            if (r7 >= r8) goto L9f
            r7 = 22050(0x5622, float:3.0899E-41)
        L9f:
            org.fortheloss.framework.IPlatform r8 = org.fortheloss.sticknodes.App.platform     // Catch: java.lang.Throwable -> L302
            java.io.File r9 = r1._mp3FileToEncode     // Catch: java.lang.Throwable -> L302
            java.lang.String r10 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L302
            int r7 = r8.mp3ToPCM(r9, r10, r7)     // Catch: java.lang.Throwable -> L302
            if (r7 != 0) goto Laf
            r7 = 1
            goto Lb0
        Laf:
            r7 = 0
        Lb0:
            java.io.PrintStream r8 = java.lang.System.out     // Catch: java.lang.Throwable -> L302
            java.lang.String r9 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L302
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L302
            r10.<init>()     // Catch: java.lang.Throwable -> L302
            java.lang.String r11 = "AudioEncodingThread: soundFilePCM absolute path is: "
            r10.append(r11)     // Catch: java.lang.Throwable -> L302
            r10.append(r9)     // Catch: java.lang.Throwable -> L302
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Throwable -> L302
            r8.println(r9)     // Catch: java.lang.Throwable -> L302
            if (r7 != 0) goto L144
            java.io.PrintStream r8 = java.lang.System.out     // Catch: java.lang.Throwable -> L302
            java.lang.String r9 = "AudioEncodingThread: Reading PCM bytes."
            r8.println(r9)     // Catch: java.lang.Throwable -> L302
            com.badlogic.gdx.Application r8 = com.badlogic.gdx.Gdx.app     // Catch: java.lang.Throwable -> L302
            com.badlogic.gdx.Application$ApplicationType r8 = r8.getType()     // Catch: java.lang.Throwable -> L302
            com.badlogic.gdx.Application$ApplicationType r9 = com.badlogic.gdx.Application.ApplicationType.iOS     // Catch: java.lang.Throwable -> L302
            if (r8 != r9) goto L10a
            java.io.PrintStream r8 = java.lang.System.out     // Catch: java.lang.Throwable -> L302
            java.lang.String r9 = "AudioEncodingThread: Not actually PCM bytes, since iOS only encodes into WAV."
            r8.println(r9)     // Catch: java.lang.Throwable -> L302
            com.intervigil.wave.WaveReader r8 = new com.intervigil.wave.WaveReader     // Catch: java.lang.Throwable -> L302
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L302
            byte[] r9 = r8.openWave()     // Catch: java.lang.Exception -> Lfd java.lang.Throwable -> L302
            if (r9 != 0) goto Lf7
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L302
            java.lang.String r7 = "AudioEncodingThread: Reading WAV file failed."
            r0.println(r7)     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L302
            r7 = 1
        Lf7:
            r8.closeWaveFile()     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L302
            goto L145
        Lfb:
            r0 = move-exception
            goto Lff
        Lfd:
            r0 = move-exception
            r9 = 0
        Lff:
            java.io.PrintStream r7 = java.lang.System.out     // Catch: java.lang.Throwable -> L302
            java.lang.String r8 = "AudioEncodingThread: Reading WAV file failed."
            r7.println(r8)     // Catch: java.lang.Throwable -> L302
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L302
            goto L13a
        L10a:
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L125 java.io.IOException -> L128
            java.lang.String r9 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L125 java.io.IOException -> L128
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L125 java.io.IOException -> L128
            long r9 = r0.length()     // Catch: java.io.IOException -> L123 java.lang.Throwable -> L13c
            int r0 = (int) r9     // Catch: java.io.IOException -> L123 java.lang.Throwable -> L13c
            byte[] r9 = new byte[r0]     // Catch: java.io.IOException -> L123 java.lang.Throwable -> L13c
            r8.read(r9)     // Catch: java.io.IOException -> L121 java.lang.Throwable -> L13c
            r8.close()     // Catch: java.io.IOException -> L145 java.lang.Throwable -> L302
            goto L145
        L121:
            r0 = move-exception
            goto L12b
        L123:
            r0 = move-exception
            goto L12a
        L125:
            r0 = move-exception
            r2 = 0
            goto L13e
        L128:
            r0 = move-exception
            r8 = 0
        L12a:
            r9 = 0
        L12b:
            java.io.PrintStream r7 = java.lang.System.out     // Catch: java.lang.Throwable -> L13c
            java.lang.String r10 = "AudioEncodingThread: Failed to read PCM bytes."
            r7.println(r10)     // Catch: java.lang.Throwable -> L13c
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L13c
            if (r8 == 0) goto L13a
            r8.close()     // Catch: java.io.IOException -> L13a java.lang.Throwable -> L302
        L13a:
            r7 = 1
            goto L145
        L13c:
            r0 = move-exception
            r2 = r8
        L13e:
            if (r2 == 0) goto L143
            r2.close()     // Catch: java.io.IOException -> L143 java.lang.Throwable -> L302
        L143:
            throw r0     // Catch: java.lang.Throwable -> L302
        L144:
            r9 = 0
        L145:
            int r0 = r1._waveHeaderLength     // Catch: java.lang.Throwable -> L302
            int r8 = r1._frameIndex     // Catch: java.lang.Throwable -> L302
            float r8 = (float) r8     // Catch: java.lang.Throwable -> L302
            float r10 = r1._waveSamplePerFrame     // Catch: java.lang.Throwable -> L302
            float r8 = r8 * r10
            int r8 = (int) r8     // Catch: java.lang.Throwable -> L302
            int r8 = r8 * 2
            int r4 = r0 + r8
            int r0 = r1._waveTotalBytes     // Catch: java.lang.Throwable -> L302
            int r8 = r0 - r4
            if (r7 != 0) goto L208
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L302
            java.lang.String r10 = "AudioEncodingThread: Reading section of output WAVE file's bytes."
            r0.println(r10)     // Catch: java.lang.Throwable -> L302
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L302
            int r10 = r1._waveHeaderLength     // Catch: java.lang.Throwable -> L302
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L302
            r11.<init>()     // Catch: java.lang.Throwable -> L302
            java.lang.String r12 = "               _waveHeaderLength: "
            r11.append(r12)     // Catch: java.lang.Throwable -> L302
            r11.append(r10)     // Catch: java.lang.Throwable -> L302
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Throwable -> L302
            r0.println(r10)     // Catch: java.lang.Throwable -> L302
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L302
            int r10 = r1._frameIndex     // Catch: java.lang.Throwable -> L302
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L302
            r11.<init>()     // Catch: java.lang.Throwable -> L302
            java.lang.String r12 = "                     _frameIndex: "
            r11.append(r12)     // Catch: java.lang.Throwable -> L302
            r11.append(r10)     // Catch: java.lang.Throwable -> L302
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Throwable -> L302
            r0.println(r10)     // Catch: java.lang.Throwable -> L302
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L302
            float r10 = r1._waveSamplePerFrame     // Catch: java.lang.Throwable -> L302
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L302
            r11.<init>()     // Catch: java.lang.Throwable -> L302
            java.lang.String r12 = "            _waveSamplesPerFrame: "
            r11.append(r12)     // Catch: java.lang.Throwable -> L302
            r11.append(r10)     // Catch: java.lang.Throwable -> L302
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Throwable -> L302
            r0.println(r10)     // Catch: java.lang.Throwable -> L302
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L302
            int r10 = r1._waveTotalBytes     // Catch: java.lang.Throwable -> L302
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L302
            r11.<init>()     // Catch: java.lang.Throwable -> L302
            java.lang.String r12 = "                 _waveTotalBytes: "
            r11.append(r12)     // Catch: java.lang.Throwable -> L302
            r11.append(r10)     // Catch: java.lang.Throwable -> L302
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Throwable -> L302
            r0.println(r10)     // Catch: java.lang.Throwable -> L302
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L302
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L302
            r10.<init>()     // Catch: java.lang.Throwable -> L302
            java.lang.String r11 = "                  byteSkipOffset: "
            r10.append(r11)     // Catch: java.lang.Throwable -> L302
            r10.append(r4)     // Catch: java.lang.Throwable -> L302
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L302
            r0.println(r10)     // Catch: java.lang.Throwable -> L302
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L302
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L302
            r10.<init>()     // Catch: java.lang.Throwable -> L302
            java.lang.String r11 = "    bytesRemainingPastSkipOffset: "
            r10.append(r11)     // Catch: java.lang.Throwable -> L302
            r10.append(r8)     // Catch: java.lang.Throwable -> L302
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L302
            r0.println(r10)     // Catch: java.lang.Throwable -> L302
            int r0 = r9.length     // Catch: java.lang.Throwable -> L302
            byte[] r10 = new byte[r0]     // Catch: java.lang.Throwable -> L302
            java.io.RandomAccessFile r11 = r1._waveOutputRandomAccessFile     // Catch: java.io.IOException -> L1fb java.lang.Throwable -> L302
            long r12 = (long) r4     // Catch: java.io.IOException -> L1fb java.lang.Throwable -> L302
            r11.seek(r12)     // Catch: java.io.IOException -> L1fb java.lang.Throwable -> L302
            java.io.RandomAccessFile r11 = r1._waveOutputRandomAccessFile     // Catch: java.io.IOException -> L1fb java.lang.Throwable -> L302
            r11.read(r10, r3, r0)     // Catch: java.io.IOException -> L1fb java.lang.Throwable -> L302
            goto L209
        L1fb:
            r0 = move-exception
            java.io.PrintStream r7 = java.lang.System.out     // Catch: java.lang.Throwable -> L302
            java.lang.String r11 = "AudioEncodingThread: Failed to read output WAVE file's bytes."
            r7.println(r11)     // Catch: java.lang.Throwable -> L302
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L302
            r7 = 1
            goto L209
        L208:
            r10 = 0
        L209:
            if (r7 != 0) goto L2cb
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L302
            java.lang.String r11 = "AudioEncodingThread: Mixing PCM samples with samples taken from output WAVE file."
            r0.println(r11)     // Catch: java.lang.Throwable -> L302
            float r0 = r1._soundPan     // Catch: java.lang.Throwable -> L302
            r11 = 0
            r12 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 >= 0) goto L223
            float r0 = r1._soundPan     // Catch: java.lang.Throwable -> L302
            float r0 = r0 + r12
            float r0 = com.badlogic.gdx.math.MathUtils.clamp(r0, r11, r12)     // Catch: java.lang.Throwable -> L302
            goto L234
        L223:
            float r0 = r1._soundPan     // Catch: java.lang.Throwable -> L302
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 <= 0) goto L232
            float r0 = r1._soundPan     // Catch: java.lang.Throwable -> L302
            float r0 = r12 - r0
            float r0 = com.badlogic.gdx.math.MathUtils.clamp(r0, r11, r12)     // Catch: java.lang.Throwable -> L302
            r12 = r0
        L232:
            r0 = 1065353216(0x3f800000, float:1.0)
        L234:
            int r11 = r9.length     // Catch: java.lang.Throwable -> L302
            int r11 = r11 - r5
            r13 = 0
            r14 = 1
        L238:
            if (r13 >= r11) goto L287
            int r15 = r13 + 1
            r5 = r9[r15]     // Catch: java.lang.Throwable -> L302
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 8
            r2 = r9[r13]     // Catch: java.lang.Throwable -> L302
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 | r5
            short r2 = (short) r2     // Catch: java.lang.Throwable -> L302
            r5 = r10[r15]     // Catch: java.lang.Throwable -> L302
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 8
            r3 = r10[r13]     // Catch: java.lang.Throwable -> L302
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 | r5
            short r3 = (short) r3     // Catch: java.lang.Throwable -> L302
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L302
            float r5 = r1._soundVolume     // Catch: java.lang.Throwable -> L302
            float r2 = r2 * r5
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L302
            short r2 = (short) r2     // Catch: java.lang.Throwable -> L302
            if (r14 == 0) goto L261
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L302
            float r2 = r2 * r12
            goto L264
        L261:
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L302
            float r2 = r2 * r0
        L264:
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L302
            short r2 = (short) r2     // Catch: java.lang.Throwable -> L302
            r14 = r14 ^ 1
            int r2 = r2 + r3
            r3 = 32767(0x7fff, float:4.5916E-41)
            r5 = -32768(0xffffffffffff8000, float:NaN)
            if (r2 >= r5) goto L272
            r2 = -32768(0xffffffffffff8000, float:NaN)
            goto L276
        L272:
            if (r2 <= r3) goto L276
            r2 = 32767(0x7fff, float:4.5916E-41)
        L276:
            int r3 = r2 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L302
            r9[r15] = r3     // Catch: java.lang.Throwable -> L302
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L302
            r9[r13] = r2     // Catch: java.lang.Throwable -> L302
            int r13 = r13 + 2
            r3 = 0
            r5 = 1
            goto L238
        L287:
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L302
            java.lang.String r2 = "AudioEncodingThread: Writing the mixed samples back to the output WAVE file."
            r0.println(r2)     // Catch: java.lang.Throwable -> L302
            java.io.RandomAccessFile r0 = r1._waveOutputRandomAccessFile     // Catch: java.io.IOException -> L2bf java.lang.Throwable -> L302
            long r2 = (long) r4     // Catch: java.io.IOException -> L2bf java.lang.Throwable -> L302
            r0.seek(r2)     // Catch: java.io.IOException -> L2bf java.lang.Throwable -> L302
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.io.IOException -> L2bf java.lang.Throwable -> L302
            int r2 = r9.length     // Catch: java.io.IOException -> L2bf java.lang.Throwable -> L302
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L2bf java.lang.Throwable -> L302
            r3.<init>()     // Catch: java.io.IOException -> L2bf java.lang.Throwable -> L302
            java.lang.String r4 = "    Raw sound file pcmBytes.length is "
            r3.append(r4)     // Catch: java.io.IOException -> L2bf java.lang.Throwable -> L302
            r3.append(r2)     // Catch: java.io.IOException -> L2bf java.lang.Throwable -> L302
            java.lang.String r2 = ", bytesRemainingPastSkipOffset (num bytes to EoF) is "
            r3.append(r2)     // Catch: java.io.IOException -> L2bf java.lang.Throwable -> L302
            r3.append(r8)     // Catch: java.io.IOException -> L2bf java.lang.Throwable -> L302
            java.lang.String r2 = r3.toString()     // Catch: java.io.IOException -> L2bf java.lang.Throwable -> L302
            r0.println(r2)     // Catch: java.io.IOException -> L2bf java.lang.Throwable -> L302
            java.io.RandomAccessFile r0 = r1._waveOutputRandomAccessFile     // Catch: java.io.IOException -> L2bf java.lang.Throwable -> L302
            int r2 = r9.length     // Catch: java.io.IOException -> L2bf java.lang.Throwable -> L302
            int r2 = java.lang.Math.min(r2, r8)     // Catch: java.io.IOException -> L2bf java.lang.Throwable -> L302
            r3 = 0
            r0.write(r9, r3, r2)     // Catch: java.io.IOException -> L2bf java.lang.Throwable -> L302
            goto L2cb
        L2bf:
            r0 = move-exception
            java.io.PrintStream r2 = java.lang.System.out     // Catch: java.lang.Throwable -> L302
            java.lang.String r3 = "AudioEncodingThread: Failed to write the mixed samples back to output WAVE file."
            r2.println(r3)     // Catch: java.lang.Throwable -> L302
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L302
            r7 = 1
        L2cb:
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L302
            java.io.File r2 = r1._mp3FileToEncode     // Catch: java.lang.Throwable -> L302
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L302
            if (r7 != 0) goto L2d7
            r3 = 1
            goto L2d8
        L2d7:
            r3 = 0
        L2d8:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L302
            r4.<init>()     // Catch: java.lang.Throwable -> L302
            java.lang.String r5 = "AudioEncodingThread: Finished writing the sound ("
            r4.append(r5)     // Catch: java.lang.Throwable -> L302
            r4.append(r2)     // Catch: java.lang.Throwable -> L302
            java.lang.String r2 = ") to the output WAVE file, success: "
            r4.append(r2)     // Catch: java.lang.Throwable -> L302
            r4.append(r3)     // Catch: java.lang.Throwable -> L302
            java.lang.String r2 = "."
            r4.append(r2)     // Catch: java.lang.Throwable -> L302
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L302
            r0.println(r2)     // Catch: java.lang.Throwable -> L302
            r2 = 0
            r1._mp3FileToEncode = r2     // Catch: java.lang.Throwable -> L302
            r16.processNextAudioEvent()     // Catch: java.lang.Throwable -> L302
        L2ff:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L302
            goto L2
        L302:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L302
            throw r0
        L305:
            if (r0 != r4) goto L2
            java.lang.Object r2 = r1._lockObject
            monitor-enter(r2)
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L40f
            java.lang.String r3 = "AudioEncodingThread: Encoding output WAVE file to AAC..."
            r0.println(r3)     // Catch: java.lang.Throwable -> L40f
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform     // Catch: java.lang.Throwable -> L40f
            java.io.File r3 = r1._waveOutputFile     // Catch: java.lang.Throwable -> L40f
            java.io.File r5 = r1._aacFile     // Catch: java.lang.Throwable -> L40f
            java.lang.String r5 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L40f
            int r0 = r0.wavToAAC(r3, r5)     // Catch: java.lang.Throwable -> L40f
            if (r0 != 0) goto L323
            r3 = 1
            goto L324
        L323:
            r3 = 0
        L324:
            if (r3 != 0) goto L3fe
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app     // Catch: java.lang.Throwable -> L40f
            com.badlogic.gdx.Application$ApplicationType r0 = r0.getType()     // Catch: java.lang.Throwable -> L40f
            com.badlogic.gdx.Application$ApplicationType r5 = com.badlogic.gdx.Application.ApplicationType.iOS     // Catch: java.lang.Throwable -> L40f
            if (r0 != r5) goto L37a
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L40f
            java.lang.String r5 = "AudioEncodingThread: Going to mux with native iOS code."
            r0.println(r5)     // Catch: java.lang.Throwable -> L40f
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform     // Catch: java.lang.Throwable -> L40f
            org.fortheloss.framework.IPlatformMuxer r0 = r0.getPlatformMuxer()     // Catch: java.lang.Throwable -> L40f
            java.io.File r5 = r1._videoFile     // Catch: java.lang.Throwable -> L40f
            java.io.File r6 = r1._aacFile     // Catch: java.lang.Throwable -> L40f
            java.io.File r7 = r1._outputFile     // Catch: java.lang.Throwable -> L40f
            boolean r0 = r0.mux(r5, r6, r7)     // Catch: java.lang.Throwable -> L40f
            if (r0 != 0) goto L351
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L40f
            java.lang.String r3 = "AudioEncodingThread: Failed to mux with native iOS code."
            r0.println(r3)     // Catch: java.lang.Throwable -> L40f
            r3 = 1
        L351:
            java.io.File r0 = r1._videoFile     // Catch: java.lang.Throwable -> L40f
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L40f
            if (r0 == 0) goto L35e
            java.io.File r0 = r1._videoFile     // Catch: java.lang.Throwable -> L40f
            r0.delete()     // Catch: java.lang.Throwable -> L40f
        L35e:
            java.io.File r0 = r1._aacFile     // Catch: java.lang.Throwable -> L40f
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L40f
            if (r0 == 0) goto L36b
            java.io.File r0 = r1._aacFile     // Catch: java.lang.Throwable -> L40f
            r0.delete()     // Catch: java.lang.Throwable -> L40f
        L36b:
            java.io.File r0 = r1._waveOutputFile     // Catch: java.lang.Throwable -> L40f
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L40f
            if (r0 == 0) goto L3fe
            java.io.File r0 = r1._waveOutputFile     // Catch: java.lang.Throwable -> L40f
            r0.delete()     // Catch: java.lang.Throwable -> L40f
            goto L3fe
        L37a:
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L40f
            java.lang.String r5 = "AudioEncodingThread: Going to mux with MP4Parser."
            r0.println(r5)     // Catch: java.lang.Throwable -> L40f
            java.io.File r0 = r1._videoFile     // Catch: java.lang.Exception -> L3ed java.lang.Throwable -> L40f
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Exception -> L3ed java.lang.Throwable -> L40f
            com.googlecode.mp4parser.authoring.Movie r0 = com.googlecode.mp4parser.authoring.container.mp4.MovieCreator.build(r0)     // Catch: java.lang.Exception -> L3ed java.lang.Throwable -> L40f
            com.googlecode.mp4parser.authoring.tracks.AACTrackImpl r6 = new com.googlecode.mp4parser.authoring.tracks.AACTrackImpl     // Catch: java.lang.Exception -> L3ed java.lang.Throwable -> L40f
            com.googlecode.mp4parser.FileDataSourceImpl r5 = new com.googlecode.mp4parser.FileDataSourceImpl     // Catch: java.lang.Exception -> L3ed java.lang.Throwable -> L40f
            java.io.File r7 = r1._aacFile     // Catch: java.lang.Exception -> L3ed java.lang.Throwable -> L40f
            r5.<init>(r7)     // Catch: java.lang.Exception -> L3ed java.lang.Throwable -> L40f
            r6.<init>(r5)     // Catch: java.lang.Exception -> L3ed java.lang.Throwable -> L40f
            com.googlecode.mp4parser.authoring.tracks.CroppedTrack r11 = new com.googlecode.mp4parser.authoring.tracks.CroppedTrack     // Catch: java.lang.Exception -> L3ed java.lang.Throwable -> L40f
            r7 = 1
            java.util.List r5 = r6.getSamples()     // Catch: java.lang.Exception -> L3ed java.lang.Throwable -> L40f
            int r5 = r5.size()     // Catch: java.lang.Exception -> L3ed java.lang.Throwable -> L40f
            long r9 = (long) r5     // Catch: java.lang.Exception -> L3ed java.lang.Throwable -> L40f
            r5 = r11
            r5.<init>(r6, r7, r9)     // Catch: java.lang.Exception -> L3ed java.lang.Throwable -> L40f
            r0.addTrack(r11)     // Catch: java.lang.Exception -> L3ed java.lang.Throwable -> L40f
            com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder r5 = new com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder     // Catch: java.lang.Exception -> L3ed java.lang.Throwable -> L40f
            r5.<init>()     // Catch: java.lang.Exception -> L3ed java.lang.Throwable -> L40f
            com.coremedia.iso.boxes.Container r0 = r5.build(r0)     // Catch: java.lang.Exception -> L3ed java.lang.Throwable -> L40f
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L3ed java.lang.Throwable -> L40f
            java.io.File r6 = r1._outputFile     // Catch: java.lang.Exception -> L3ed java.lang.Throwable -> L40f
            r5.<init>(r6)     // Catch: java.lang.Exception -> L3ed java.lang.Throwable -> L40f
            java.nio.channels.FileChannel r6 = r5.getChannel()     // Catch: java.lang.Exception -> L3ed java.lang.Throwable -> L40f
            r0.writeContainer(r6)     // Catch: java.lang.Exception -> L3ed java.lang.Throwable -> L40f
            r5.close()     // Catch: java.lang.Exception -> L3ed java.lang.Throwable -> L40f
            java.io.File r0 = r1._videoFile     // Catch: java.lang.Exception -> L3ed java.lang.Throwable -> L40f
            boolean r0 = r0.exists()     // Catch: java.lang.Exception -> L3ed java.lang.Throwable -> L40f
            if (r0 == 0) goto L3d2
            java.io.File r0 = r1._videoFile     // Catch: java.lang.Exception -> L3ed java.lang.Throwable -> L40f
            r0.delete()     // Catch: java.lang.Exception -> L3ed java.lang.Throwable -> L40f
        L3d2:
            java.io.File r0 = r1._aacFile     // Catch: java.lang.Exception -> L3ed java.lang.Throwable -> L40f
            boolean r0 = r0.exists()     // Catch: java.lang.Exception -> L3ed java.lang.Throwable -> L40f
            if (r0 == 0) goto L3df
            java.io.File r0 = r1._aacFile     // Catch: java.lang.Exception -> L3ed java.lang.Throwable -> L40f
            r0.delete()     // Catch: java.lang.Exception -> L3ed java.lang.Throwable -> L40f
        L3df:
            java.io.File r0 = r1._waveOutputFile     // Catch: java.lang.Exception -> L3ed java.lang.Throwable -> L40f
            boolean r0 = r0.exists()     // Catch: java.lang.Exception -> L3ed java.lang.Throwable -> L40f
            if (r0 == 0) goto L3fe
            java.io.File r0 = r1._waveOutputFile     // Catch: java.lang.Exception -> L3ed java.lang.Throwable -> L40f
            r0.delete()     // Catch: java.lang.Exception -> L3ed java.lang.Throwable -> L40f
            goto L3fe
        L3ed:
            r0 = move-exception
            org.fortheloss.framework.IPlatform r3 = org.fortheloss.sticknodes.App.platform     // Catch: java.lang.Throwable -> L40f
            r3.logNonFatalException(r0)     // Catch: java.lang.Throwable -> L40f
            java.io.PrintStream r3 = java.lang.System.out     // Catch: java.lang.Throwable -> L40f
            java.lang.String r5 = "AudioEncodingThread: Failed to mux."
            r3.println(r5)     // Catch: java.lang.Throwable -> L40f
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L40f
            r3 = 1
        L3fe:
            if (r3 != 0) goto L404
            r3 = 1
            r1._result = r3     // Catch: java.lang.Throwable -> L40f
            goto L407
        L404:
            r3 = 1
            r1._result = r4     // Catch: java.lang.Throwable -> L40f
        L407:
            r1._isFinishedEncodingAudio = r3     // Catch: java.lang.Throwable -> L40f
            r3 = 0
            r1._mode = r3     // Catch: java.lang.Throwable -> L40f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L40f
            goto L2
        L40f:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L40f
            throw r0
        L412:
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r2 = "AudioEncodingThread: Disposing."
            r0.println(r2)
            r2 = 0
            r1._mp3FileToEncode = r2
            r1._waveOutputFile = r2
            r1._waveOutputRandomAccessFile = r2
            r1._audioEventsRef = r2
            r1._projectName = r2
            r1._lockObject = r2
            r1._aacFile = r2
            r1._outputFile = r2
            r1._videoFile = r2
            return
    }
}
