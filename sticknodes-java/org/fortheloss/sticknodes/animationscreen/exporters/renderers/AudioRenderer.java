package org.fortheloss.sticknodes.animationscreen.exporters.renderers;

/* loaded from: classes2.dex */
public class AudioRenderer implements com.badlogic.gdx.utils.Disposable {
    private int _actualFPS;
    private int _actualNumTweenedFrames;
    private int _endFrame;
    private java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.AudioEvent> _frameAudioEvents;
    private int _frameIndex;
    private int _keyframeIndex;
    private org.fortheloss.sticknodes.PlaybackRepeatManager _playbackRepeatManager;
    private org.fortheloss.sticknodes.data.ProjectData _projectDataRef;
    private boolean _projectTweeningEnabled;
    private int _startFrame;
    private java.lang.String _statusString;

    public AudioRenderer(org.fortheloss.sticknodes.data.ProjectData r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._projectTweeningEnabled = r0
            r1._actualNumTweenedFrames = r0
            r1._actualFPS = r0
            r1._frameIndex = r0
            r1._projectDataRef = r2
            r1._startFrame = r3
            r1._endFrame = r4
            int r2 = r3 + (-1)
            r1._keyframeIndex = r2
            org.fortheloss.sticknodes.PlaybackRepeatManager r2 = new org.fortheloss.sticknodes.PlaybackRepeatManager
            r2.<init>()
            r1._playbackRepeatManager = r2
            org.fortheloss.sticknodes.data.ProjectData r4 = r1._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r4 = r4.frames
            int r3 = r3 + (-1)
            java.lang.Object r4 = r4.get(r3)
            org.fortheloss.sticknodes.data.IFrameData r4 = (org.fortheloss.sticknodes.data.IFrameData) r4
            r2.prepare(r4, r3)
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            r0 = 0
            r3._projectDataRef = r0
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.AudioEvent> r1 = r3._frameAudioEvents
            if (r1 == 0) goto L1f
            int r1 = r1.size()
            int r1 = r1 + (-1)
        Ld:
            if (r1 < 0) goto L1d
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.AudioEvent> r2 = r3._frameAudioEvents
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.AudioEvent r2 = (org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.AudioEvent) r2
            r2.dispose()
            int r1 = r1 + (-1)
            goto Ld
        L1d:
            r3._frameAudioEvents = r0
        L1f:
            r3._statusString = r0
            r3._playbackRepeatManager = r0
            return
    }

    public java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.AudioEvent> getNextAudioEvents() {
            r24 = this;
            r0 = r24
            int r1 = r0._keyframeIndex
            int r2 = r0._endFrame
            if (r1 < r2) goto La
            r1 = 0
            return r1
        La:
            org.fortheloss.sticknodes.data.ProjectData r2 = r0._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r2 = r2.frames
            java.lang.Object r1 = r2.get(r1)
            org.fortheloss.sticknodes.data.FrameData r1 = (org.fortheloss.sticknodes.data.FrameData) r1
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.AudioEvent> r2 = r0._frameAudioEvents
            int r2 = r2.size()
            r3 = 1
            int r2 = r2 - r3
        L1c:
            if (r2 < 0) goto L2c
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.AudioEvent> r4 = r0._frameAudioEvents
            java.lang.Object r4 = r4.get(r2)
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.AudioEvent r4 = (org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.AudioEvent) r4
            r4.dispose()
            int r2 = r2 + (-1)
            goto L1c
        L2c:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.AudioEvent> r2 = r0._frameAudioEvents
            r2.clear()
            boolean r2 = r1.willStopSounds()
            if (r2 == 0) goto L5b
            java.io.PrintStream r2 = java.lang.System.out
            int r4 = r0._keyframeIndex
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "========= AudioRenderer: Found mute request on frame "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r2.println(r4)
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.FrameApplySilenceEvent r2 = new org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.FrameApplySilenceEvent
            int r4 = r0._frameIndex
            r2.<init>(r4)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.AudioEvent> r4 = r0._frameAudioEvents
            r4.add(r2)
        L5b:
            int r2 = r1.getSoundToPlayLibraryID()
            if (r2 < 0) goto Lc3
            java.io.PrintStream r2 = java.lang.System.out
            int r4 = r0._keyframeIndex
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "========= AudioRenderer: Found normal frame sound on frame "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r2.println(r4)
            org.fortheloss.sticknodes.data.ProjectData r2 = r0._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r2 = r2.librarySoundDatas
            int r4 = r1.getSoundToPlayLibraryID()
            java.lang.Object r2 = r2.get(r4)
            org.fortheloss.sticknodes.data.SoundData r2 = (org.fortheloss.sticknodes.data.SoundData) r2
            java.lang.String r2 = r2.fileName
            com.badlogic.gdx.Files r4 = com.badlogic.gdx.Gdx.files
            java.lang.String r5 = org.fortheloss.sticknodes.App.soundsPath
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            com.badlogic.gdx.files.FileHandle r2 = r4.absolute(r2)
            java.io.File r6 = r2.file()
            boolean r2 = r6.exists()
            if (r2 == 0) goto Lc3
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.FramePlaySoundEvent r2 = new org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.FramePlaySoundEvent
            int r5 = r0._frameIndex
            float r7 = r1.getSoundVolume()
            float r8 = r1.getSoundPan()
            float r9 = r1.getSoundPitch()
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.AudioEvent> r4 = r0._frameAudioEvents
            r4.add(r2)
        Lc3:
            boolean r2 = r1.isDelayed()
            java.lang.String r4 = "========= AudioRenderer: Found frame with an MC on it with sound on frame "
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L2c4
            float r2 = r1.getDelaySeconds()
            int r7 = r0._actualFPS
            float r7 = (float) r7
            float r7 = r5 / r7
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 <= 0) goto L2c4
            java.util.ArrayList r2 = r1.getDrawableFigures()
            int r7 = r2.size()
            int r7 = r7 - r3
        Le3:
            if (r7 < 0) goto L370
            java.lang.Object r8 = r2.get(r7)
            boolean r8 = r8 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r8 == 0) goto L2b9
            java.lang.Object r8 = r2.get(r7)
            org.fortheloss.sticknodes.movieclip.MCReference r8 = (org.fortheloss.sticknodes.movieclip.MCReference) r8
            org.fortheloss.sticknodes.data.ProjectData r9 = r0._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r9 = r9.libraryMovieclips
            int r10 = r8.getLibraryID()
            java.lang.Object r9 = r9.get(r10)
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r9 = (org.fortheloss.sticknodes.movieclip.MCMovieclipSource) r9
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r9 = r9.frames
            int r10 = r8.getPlaymode()
            if (r10 == 0) goto L2b9
            boolean r10 = r8.getPlayDuringDelay()
            if (r10 != 0) goto L188
            int r10 = r8.getCurrentFrameIndex()
            java.lang.Object r9 = r9.get(r10)
            org.fortheloss.sticknodes.data.MCFrameData r9 = (org.fortheloss.sticknodes.data.MCFrameData) r9
            int r10 = r9.getSoundToPlayLibraryID()
            if (r10 < 0) goto L2b9
            java.io.PrintStream r10 = java.lang.System.out
            int r11 = r0._keyframeIndex
            int r11 = r11 + r3
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r4)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.println(r11)
            org.fortheloss.sticknodes.data.ProjectData r10 = r0._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r10 = r10.librarySoundDatas
            int r11 = r9.getSoundToPlayLibraryID()
            java.lang.Object r10 = r10.get(r11)
            org.fortheloss.sticknodes.data.SoundData r10 = (org.fortheloss.sticknodes.data.SoundData) r10
            java.lang.String r10 = r10.fileName
            com.badlogic.gdx.Files r11 = com.badlogic.gdx.Gdx.files
            java.lang.String r12 = org.fortheloss.sticknodes.App.soundsPath
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r12)
            r13.append(r10)
            java.lang.String r10 = r13.toString()
            com.badlogic.gdx.files.FileHandle r10 = r11.absolute(r10)
            java.io.File r13 = r10.file()
            boolean r10 = r13.exists()
            if (r10 == 0) goto L2b9
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.FramePlaySoundEvent r10 = new org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.FramePlaySoundEvent
            int r12 = r0._frameIndex
            float r11 = r9.getSoundVolume()
            float r8 = r8.getVolumeScale()
            float r14 = r11 * r8
            float r15 = r9.getSoundPan()
            float r16 = r9.getSoundPitch()
            r11 = r10
            r11.<init>(r12, r13, r14, r15, r16)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.AudioEvent> r8 = r0._frameAudioEvents
            r8.add(r10)
            goto L2b9
        L188:
            org.fortheloss.sticknodes.data.ProjectData r10 = r0._projectDataRef
            float r11 = r1.getDelaySeconds()
            int r10 = r10.getNumFramesForFrameDelay(r11)
            int r11 = r8.getCurrentFrameIndex()
            boolean r12 = r0._projectTweeningEnabled
            if (r12 == 0) goto L19e
            int r12 = r0._actualNumTweenedFrames
            int r12 = r12 + r3
            goto L19f
        L19e:
            r12 = 1
        L19f:
            int r13 = r8.getNumFrames(r3)
            r14 = 0
        L1a4:
            if (r14 >= r10) goto L23b
            java.lang.Object r15 = r9.get(r11)
            org.fortheloss.sticknodes.data.MCFrameData r15 = (org.fortheloss.sticknodes.data.MCFrameData) r15
            int r16 = r15.getSoundToPlayLibraryID()
            if (r16 < 0) goto L221
            java.io.PrintStream r5 = java.lang.System.out
            int r6 = r0._keyframeIndex
            int r6 = r6 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r17 = r2
            java.lang.String r2 = "========= AudioRenderer: Found a DELAY frame with an MC on it with sound on frame "
            r3.append(r2)
            r3.append(r6)
            java.lang.String r2 = r3.toString()
            r5.println(r2)
            org.fortheloss.sticknodes.data.ProjectData r2 = r0._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r2 = r2.librarySoundDatas
            int r3 = r15.getSoundToPlayLibraryID()
            java.lang.Object r2 = r2.get(r3)
            org.fortheloss.sticknodes.data.SoundData r2 = (org.fortheloss.sticknodes.data.SoundData) r2
            java.lang.String r2 = r2.fileName
            com.badlogic.gdx.Files r3 = com.badlogic.gdx.Gdx.files
            java.lang.String r5 = org.fortheloss.sticknodes.App.soundsPath
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            com.badlogic.gdx.files.FileHandle r2 = r3.absolute(r2)
            java.io.File r20 = r2.file()
            boolean r2 = r20.exists()
            if (r2 == 0) goto L223
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.FramePlaySoundEvent r2 = new org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.FramePlaySoundEvent
            int r3 = r0._frameIndex
            int r19 = r3 + r14
            float r3 = r15.getSoundVolume()
            float r5 = r8.getVolumeScale()
            float r21 = r3 * r5
            float r22 = r15.getSoundPan()
            float r23 = r15.getSoundPitch()
            r18 = r2
            r18.<init>(r19, r20, r21, r22, r23)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.AudioEvent> r3 = r0._frameAudioEvents
            r3.add(r2)
            goto L223
        L221:
            r17 = r2
        L223:
            int r14 = r14 + r12
            int r2 = r8.getPlaymode()
            r3 = 1
            if (r2 != r3) goto L231
            int r11 = r11 + 1
            if (r11 < r13) goto L234
            goto L2bb
        L231:
            int r11 = r11 + 1
            int r11 = r11 % r13
        L234:
            r2 = r17
            r3 = 1
            r5 = 1065353216(0x3f800000, float:1.0)
            goto L1a4
        L23b:
            r17 = r2
            if (r14 <= r10) goto L2bb
            java.lang.Object r2 = r9.get(r11)
            org.fortheloss.sticknodes.data.MCFrameData r2 = (org.fortheloss.sticknodes.data.MCFrameData) r2
            int r3 = r2.getSoundToPlayLibraryID()
            if (r3 < 0) goto L2bb
            java.io.PrintStream r3 = java.lang.System.out
            int r5 = r0._keyframeIndex
            r6 = 1
            int r5 = r5 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "========= AudioRenderer: Found an extra sound to add at end of DELAY frame with an MC on it with sound on frame "
            r6.append(r9)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r3.println(r5)
            org.fortheloss.sticknodes.data.ProjectData r3 = r0._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r3 = r3.librarySoundDatas
            int r5 = r2.getSoundToPlayLibraryID()
            java.lang.Object r3 = r3.get(r5)
            org.fortheloss.sticknodes.data.SoundData r3 = (org.fortheloss.sticknodes.data.SoundData) r3
            java.lang.String r3 = r3.fileName
            com.badlogic.gdx.Files r5 = com.badlogic.gdx.Gdx.files
            java.lang.String r6 = org.fortheloss.sticknodes.App.soundsPath
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            r9.append(r3)
            java.lang.String r3 = r9.toString()
            com.badlogic.gdx.files.FileHandle r3 = r5.absolute(r3)
            java.io.File r20 = r3.file()
            boolean r3 = r20.exists()
            if (r3 == 0) goto L2bb
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.FramePlaySoundEvent r3 = new org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.FramePlaySoundEvent
            int r5 = r0._frameIndex
            int r19 = r5 + r10
            float r5 = r2.getSoundVolume()
            float r6 = r8.getVolumeScale()
            float r21 = r5 * r6
            float r22 = r2.getSoundPan()
            float r23 = r2.getSoundPitch()
            r18 = r3
            r18.<init>(r19, r20, r21, r22, r23)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.AudioEvent> r2 = r0._frameAudioEvents
            r2.add(r3)
            goto L2bb
        L2b9:
            r17 = r2
        L2bb:
            int r7 = r7 + (-1)
            r2 = r17
            r3 = 1
            r5 = 1065353216(0x3f800000, float:1.0)
            goto Le3
        L2c4:
            java.util.ArrayList r2 = r1.getDrawableFigures()
            int r3 = r2.size()
            r5 = 1
            int r3 = r3 - r5
        L2ce:
            if (r3 < 0) goto L370
            java.lang.Object r5 = r2.get(r3)
            boolean r5 = r5 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r5 == 0) goto L36c
            java.lang.Object r5 = r2.get(r3)
            org.fortheloss.sticknodes.movieclip.MCReference r5 = (org.fortheloss.sticknodes.movieclip.MCReference) r5
            int r6 = r5.getPlaymode()
            if (r6 == 0) goto L36c
            org.fortheloss.sticknodes.data.ProjectData r6 = r0._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r6 = r6.libraryMovieclips
            int r7 = r5.getLibraryID()
            java.lang.Object r6 = r6.get(r7)
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r6 = (org.fortheloss.sticknodes.movieclip.MCMovieclipSource) r6
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r6 = r6.frames
            int r7 = r5.getCurrentFrameIndex()
            java.lang.Object r6 = r6.get(r7)
            org.fortheloss.sticknodes.data.MCFrameData r6 = (org.fortheloss.sticknodes.data.MCFrameData) r6
            int r7 = r6.getSoundToPlayLibraryID()
            if (r7 < 0) goto L36c
            java.io.PrintStream r7 = java.lang.System.out
            int r8 = r0._keyframeIndex
            r9 = 1
            int r8 = r8 + r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r4)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.println(r8)
            org.fortheloss.sticknodes.data.ProjectData r7 = r0._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r7 = r7.librarySoundDatas
            int r8 = r6.getSoundToPlayLibraryID()
            java.lang.Object r7 = r7.get(r8)
            org.fortheloss.sticknodes.data.SoundData r7 = (org.fortheloss.sticknodes.data.SoundData) r7
            java.lang.String r7 = r7.fileName
            com.badlogic.gdx.Files r8 = com.badlogic.gdx.Gdx.files
            java.lang.String r9 = org.fortheloss.sticknodes.App.soundsPath
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            com.badlogic.gdx.files.FileHandle r7 = r8.absolute(r7)
            java.io.File r10 = r7.file()
            boolean r7 = r10.exists()
            if (r7 == 0) goto L36c
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.FramePlaySoundEvent r7 = new org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.FramePlaySoundEvent
            int r9 = r0._frameIndex
            float r8 = r6.getSoundVolume()
            float r5 = r5.getVolumeScale()
            float r11 = r8 * r5
            float r12 = r6.getSoundPan()
            float r13 = r6.getSoundPitch()
            r8 = r7
            r8.<init>(r9, r10, r11, r12, r13)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.AudioEvent> r5 = r0._frameAudioEvents
            r5.add(r7)
        L36c:
            int r3 = r3 + (-1)
            goto L2ce
        L370:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.AudioEvent> r3 = r0._frameAudioEvents
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            int r3 = r0._keyframeIndex
            r4 = 1
            int r3 = r3 + r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r4] = r3
            java.lang.String r3 = "statusAudio4"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r3, r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "..."
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0._statusString = r2
            org.fortheloss.sticknodes.PlaybackRepeatManager r2 = r0._playbackRepeatManager
            int r2 = r2.getGoBackFrames()
            if (r2 <= 0) goto L3be
            org.fortheloss.sticknodes.PlaybackRepeatManager r3 = r0._playbackRepeatManager
            org.fortheloss.sticknodes.data.FrameData r3 = r3.getLoopingOriginFrame()
            if (r1 != r3) goto L3be
            org.fortheloss.sticknodes.PlaybackRepeatManager r3 = r0._playbackRepeatManager
            org.fortheloss.sticknodes.data.FrameData r3 = r3.getLoopingOriginFrame()
            boolean r3 = r3.getUseTweenPropertiesDuringRepeating()
            goto L3bf
        L3be:
            r3 = 1
        L3bf:
            boolean r4 = r1.getCameraIsMovingDuringDelay()
            if (r2 >= 0) goto L3cd
            int r2 = r0._keyframeIndex
            r5 = 1
            int r2 = r2 + r5
            r0._keyframeIndex = r2
            r2 = 0
            goto L3d7
        L3cd:
            int r5 = r0._keyframeIndex
            int r5 = r5 - r2
            r2 = 0
            int r5 = java.lang.Math.max(r2, r5)
            r0._keyframeIndex = r5
        L3d7:
            int r5 = r0._keyframeIndex
            org.fortheloss.sticknodes.data.ProjectData r6 = r0._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r6 = r6.frames
            int r6 = r6.size()
            if (r5 >= r6) goto L3f6
            org.fortheloss.sticknodes.PlaybackRepeatManager r5 = r0._playbackRepeatManager
            org.fortheloss.sticknodes.data.ProjectData r6 = r0._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r6 = r6.frames
            int r7 = r0._keyframeIndex
            java.lang.Object r6 = r6.get(r7)
            org.fortheloss.sticknodes.data.IFrameData r6 = (org.fortheloss.sticknodes.data.IFrameData) r6
            int r7 = r0._keyframeIndex
            r5.calculateNextFrame(r6, r7)
        L3f6:
            int r5 = r0._frameIndex
            r6 = 1
            int r5 = r5 + r6
            r0._frameIndex = r5
            boolean r5 = r0._projectTweeningEnabled
            if (r5 == 0) goto L40d
            int r5 = r0._actualNumTweenedFrames
            if (r5 <= 0) goto L405
            goto L40b
        L405:
            boolean r5 = r1.getIsUsingSlowMotionTweenedFrames()
            if (r5 == 0) goto L40d
        L40b:
            r6 = 1
            goto L40e
        L40d:
            r6 = 0
        L40e:
            if (r4 != 0) goto L434
            if (r6 == 0) goto L434
            if (r3 == 0) goto L41a
            boolean r2 = r1.isTweened()
            if (r2 == 0) goto L434
        L41a:
            if (r3 == 0) goto L42d
            boolean r2 = r1.getIsUsingSlowMotionTweenedFrames()
            if (r2 != 0) goto L423
            goto L42d
        L423:
            int r2 = r0._frameIndex
            int r3 = r1.getSlowMotionTweenedFrames()
            int r2 = r2 + r3
            r0._frameIndex = r2
            goto L434
        L42d:
            int r2 = r0._frameIndex
            int r3 = r0._actualNumTweenedFrames
            int r2 = r2 + r3
            r0._frameIndex = r2
        L434:
            boolean r2 = r1.isDelayed()
            if (r2 == 0) goto L45a
            float r2 = r1.getDelaySeconds()
            int r3 = r0._actualFPS
            float r3 = (float) r3
            r4 = 1065353216(0x3f800000, float:1.0)
            float r5 = r4 / r3
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 <= 0) goto L45a
            int r2 = r0._frameIndex
            org.fortheloss.sticknodes.data.ProjectData r3 = r0._projectDataRef
            float r1 = r1.getDelaySeconds()
            int r1 = r3.getNumFramesForFrameDelay(r1)
            r3 = 1
            int r1 = r1 - r3
            int r2 = r2 + r1
            r0._frameIndex = r2
        L45a:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.AudioEvent> r1 = r0._frameAudioEvents
            return r1
    }

    public float getPercentComplete() {
            r2 = this;
            int r0 = r2._keyframeIndex
            float r0 = (float) r0
            int r1 = r2._endFrame
            int r1 = r1 + (-1)
            float r1 = (float) r1
            float r0 = r0 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r1, r0)
            return r0
    }

    public java.lang.String getStatusString() {
            r1 = this;
            java.lang.String r0 = r1._statusString
            return r0
    }

    public void initialize() {
            r3 = this;
            java.lang.String r0 = "statusAudio1"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "..."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3._statusString = r0
            org.fortheloss.sticknodes.data.ProjectData r0 = r3._projectDataRef
            int r1 = r3._endFrame
            int r2 = r3._startFrame
            int r1 = r1 - r2
            r2 = 1
            int r1 = r1 + r2
            boolean r0 = r0.getTweeningActuallyEnabled(r1)
            r3._projectTweeningEnabled = r0
            org.fortheloss.sticknodes.data.ProjectData r0 = r3._projectDataRef
            int r0 = r0.getActualNumTweenedFrames()
            r3._actualNumTweenedFrames = r0
            org.fortheloss.sticknodes.data.ProjectData r0 = r3._projectDataRef
            int r0 = r0.getActualFPS()
            r3._actualFPS = r0
            int r0 = r3._endFrame
            int r1 = r3._startFrame
            int r0 = r0 - r1
            if (r0 != 0) goto L60
            org.fortheloss.sticknodes.data.ProjectData r0 = r3._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            boolean r0 = r0.isDelayed()
            if (r0 == 0) goto L60
            org.fortheloss.sticknodes.data.ProjectData r0 = r3._projectDataRef
            boolean r1 = r0.tweeningEnabled
            if (r1 == 0) goto L5d
            int r0 = r0.fps
            r1 = 30
            if (r0 > r1) goto L5d
            goto L5e
        L5d:
            r2 = 0
        L5e:
            r3._projectTweeningEnabled = r2
        L60:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3._frameAudioEvents = r0
            return
    }
}
