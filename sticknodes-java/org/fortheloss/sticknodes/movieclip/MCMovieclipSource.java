package org.fortheloss.sticknodes.movieclip;

/* loaded from: classes2.dex */
public class MCMovieclipSource extends org.fortheloss.sticknodes.animationscreen.FramesContainer implements com.badlogic.gdx.utils.Disposable {
    public static int DEBUG_IMPORT_FLAG;
    private int _averageNodeCount;
    private boolean _disposed;
    private int _libraryID;
    private java.lang.String _name;
    private java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> _nextFrameStickfigureIndicesForTweening;
    private java.lang.String _savingLoadingStatusString;
    private java.util.ArrayList<java.lang.String> _soundsNotFoundFilenames;
    private java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> _thisFrameStickfigureIndicesForTweening;
    private boolean _tweenLoopProtectionEnabled;


    static {
            return
    }

    public MCMovieclipSource() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3._tweenLoopProtectionEnabled = r0
            r3._averageNodeCount = r0
            r3._disposed = r0
            int r1 = org.fortheloss.sticknodes.data.ProjectData.framesContainerUID
            int r2 = r1 + 1
            org.fortheloss.sticknodes.data.ProjectData.framesContainerUID = r2
            r3._uid = r1
            r3.tweeningEnabled = r0
            r1 = 1
            r3.isLoop = r1
            r2 = 5
            r3.numTweenedFrames = r2
            r2 = 10
            r3.fps = r2
            r2 = 0
            r3._name = r2
            r2 = -1
            r3._libraryID = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3.frames = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3._soundsNotFoundFilenames = r2
            r3._uniqueFigureID = r0
            org.fortheloss.sticknodes.data.MCFrameData r0 = new org.fortheloss.sticknodes.data.MCFrameData
            r0.<init>()
            r0.setIsLastFrame(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r3.frames
            r1.add(r0)
            return
    }

    public MCMovieclipSource(org.fortheloss.sticknodes.movieclip.MCMovieclipSource r9) {
            r8 = this;
            r8.<init>()
            r0 = 0
            r8._tweenLoopProtectionEnabled = r0
            r8._averageNodeCount = r0
            r8._disposed = r0
            int r1 = org.fortheloss.sticknodes.data.ProjectData.framesContainerUID
            int r2 = r1 + 1
            org.fortheloss.sticknodes.data.ProjectData.framesContainerUID = r2
            r8._uid = r1
            boolean r1 = r9.tweeningEnabled
            r8.tweeningEnabled = r1
            boolean r1 = r9.isLoop
            r8.isLoop = r1
            int r1 = r9.numTweenedFrames
            r8.numTweenedFrames = r1
            int r1 = r9.fps
            r8.fps = r1
            java.lang.String r1 = r9._name
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " (1)"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r8._name = r1
            int r1 = r9._libraryID
            r8._libraryID = r1
            boolean r1 = r9._tweenLoopProtectionEnabled
            r8._tweenLoopProtectionEnabled = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8.frames = r1
            int r1 = r9._uniqueFigureID
            r8._uniqueFigureID = r1
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r9.frames
            int r1 = r1.size()
            r2 = 0
        L51:
            r3 = 1
            if (r2 >= r1) goto L69
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r4 = r8.frames
            org.fortheloss.sticknodes.data.MCFrameData r5 = new org.fortheloss.sticknodes.data.MCFrameData
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r6 = r9.frames
            java.lang.Object r6 = r6.get(r2)
            org.fortheloss.sticknodes.data.MCFrameData r6 = (org.fortheloss.sticknodes.data.MCFrameData) r6
            r5.<init>(r6, r3)
            r4.add(r5)
            int r2 = r2 + 1
            goto L51
        L69:
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r9 = r8.frames
            int r9 = r9.size()
            r1 = 0
        L70:
            if (r1 >= r9) goto Lb2
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r2 = r8.frames
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.data.MCFrameData r2 = (org.fortheloss.sticknodes.data.MCFrameData) r2
            r4 = 0
            if (r1 != 0) goto L86
            if (r9 <= r3) goto L84
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r5 = r8.frames
            int r6 = r9 + (-1)
            goto L8a
        L84:
            r5 = r4
            goto L90
        L86:
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r5 = r8.frames
            int r6 = r1 + (-1)
        L8a:
            java.lang.Object r5 = r5.get(r6)
            org.fortheloss.sticknodes.data.IFrameData r5 = (org.fortheloss.sticknodes.data.IFrameData) r5
        L90:
            int r6 = r9 + (-1)
            if (r1 != r6) goto L9d
            if (r9 <= r3) goto La7
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r4 = r8.frames
            java.lang.Object r4 = r4.get(r0)
            goto La5
        L9d:
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r4 = r8.frames
            int r7 = r1 + 1
            java.lang.Object r4 = r4.get(r7)
        La5:
            org.fortheloss.sticknodes.data.IFrameData r4 = (org.fortheloss.sticknodes.data.IFrameData) r4
        La7:
            r2.restoreReferences(r5, r4)
            if (r1 != r6) goto Laf
            r2.setIsLastFrame(r3)
        Laf:
            int r1 = r1 + 1
            goto L70
        Lb2:
            return
    }

    public static org.fortheloss.sticknodes.movieclip.MCPreviewProperties getPreviewProperties(com.badlogic.gdx.files.FileHandle r10) {
            org.fortheloss.sticknodes.movieclip.MCPreviewProperties r0 = new org.fortheloss.sticknodes.movieclip.MCPreviewProperties
            r0.<init>()
            r1 = 0
            if (r10 == 0) goto Ld3
            boolean r2 = r10.exists()
            if (r2 != 0) goto L10
            goto Ld3
        L10:
            boolean r2 = org.fortheloss.sticknodes.App.checkIfContainsNonsenseData(r10)
            r3 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L33
            java.io.File r10 = r10.file()     // Catch: java.lang.Exception -> L33
            r4.<init>(r10)     // Catch: java.lang.Exception -> L33
            if (r2 == 0) goto L25
            r5 = 9
            r4.skip(r5)     // Catch: java.lang.Exception -> L33
        L25:
            java.util.zip.GZIPInputStream r10 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Exception -> L33
            r2 = 4096(0x1000, float:5.74E-42)
            r10.<init>(r4, r2)     // Catch: java.lang.Exception -> L33
            java.io.DataInputStream r2 = new java.io.DataInputStream     // Catch: java.lang.Exception -> L33
            r2.<init>(r10)     // Catch: java.lang.Exception -> L33
            r10 = 1
            goto L39
        L33:
            r10 = move-exception
            r10.printStackTrace()
            r2 = r1
            r10 = 0
        L39:
            if (r10 == 0) goto Lcd
            int r10 = r2.readInt()     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb6
            r4 = 402(0x192, float:5.63E-43)
            if (r10 < r4) goto L46
            r2.readInt()     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb6
        L46:
            r4 = 425(0x1a9, float:5.96E-43)
            if (r10 <= r4) goto L53
            org.jcodec.common.io.IOUtils.closeQuietly(r2)     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb6
            r0.dispose()     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> Lc6
            return r1
        L51:
            r10 = move-exception
            goto Lb8
        L53:
            int r1 = r2.readInt()     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb6
            r2.skipBytes(r1)     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb6
            int r1 = r2.readInt()     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb6
            r0.numFrames = r1     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb6
            int r1 = r2.readInt()     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb6
            r0.numStickfigures = r1     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb6
            r1 = 400(0x190, float:5.6E-43)
            if (r10 < r1) goto L6f
            int r10 = r2.readInt()     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb6
            goto L70
        L6f:
            r10 = 0
        L70:
            r0.numSprites = r10     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb6
            int r10 = r2.readInt()     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb6
            r0.numSounds = r10     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb6
            int r10 = r2.readInt()     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb6
            com.badlogic.gdx.graphics.Pixmap[] r1 = new com.badlogic.gdx.graphics.Pixmap[r10]     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb6
            r0.previewFrames = r1     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb6
            int r1 = r2.readInt()     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb6
            int r4 = r2.readInt()     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb6
            int r5 = r1 * r4
            int r5 = r5 * 4
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb6
            r6 = 0
        L8f:
            if (r6 >= r10) goto Lcd
            r2.readFully(r5)     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb6
            com.badlogic.gdx.graphics.Pixmap[] r7 = r0.previewFrames     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb6
            com.badlogic.gdx.graphics.Pixmap r8 = new com.badlogic.gdx.graphics.Pixmap     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb6
            com.badlogic.gdx.graphics.Pixmap$Format r9 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA8888     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb6
            r8.<init>(r1, r4, r9)     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb6
            r7[r6] = r8     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb6
            com.badlogic.gdx.graphics.Pixmap[] r7 = r0.previewFrames     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb6
            r7 = r7[r6]     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb6
            java.nio.ByteBuffer r7 = r7.getPixels()     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb6
            r7.clear()     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb6
            r7.put(r5)     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb6
            r7.position(r3)     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb6
            int r6 = r6 + 1
            goto L8f
        Lb3:
            r10 = move-exception
            r1 = r2
            goto Lc7
        Lb6:
            r10 = move-exception
            r1 = r2
        Lb8:
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform     // Catch: java.lang.Throwable -> Lc6
            r2.logNonFatalException(r10)     // Catch: java.lang.Throwable -> Lc6
            r10.printStackTrace()     // Catch: java.lang.Throwable -> Lc6
            if (r1 == 0) goto Ld2
            org.jcodec.common.io.IOUtils.closeQuietly(r1)
            goto Ld2
        Lc6:
            r10 = move-exception
        Lc7:
            if (r1 == 0) goto Lcc
            org.jcodec.common.io.IOUtils.closeQuietly(r1)
        Lcc:
            throw r10
        Lcd:
            if (r2 == 0) goto Ld2
            org.jcodec.common.io.IOUtils.closeQuietly(r2)
        Ld2:
            return r0
        Ld3:
            r0.dispose()
            return r1
    }

    private synchronized void setSavingOpeningStatusText(java.lang.String r1) {
            r0 = this;
            monitor-enter(r0)
            r0._savingLoadingStatusString = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // org.fortheloss.sticknodes.animationscreen.FramesContainer
    public boolean canAddFigure(org.fortheloss.sticknodes.data.IFrameData r4, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r5) {
            r3 = this;
            int r0 = r3.getTotalNodeCount()
            r1 = 1
            int r2 = r5.getNodeCount(r1)
            int r0 = r0 + r2
            r2 = 256000(0x3e800, float:3.58732E-40)
            if (r0 > r2) goto L1f
            int r4 = r4.getFrameTotalNodeCount()
            int r5 = r5.getNodeCount(r1)
            int r4 = r4 + r5
            int r5 = org.fortheloss.sticknodes.App.getMaxNodesPerFrame()
            if (r4 > r5) goto L1f
            goto L20
        L1f:
            r1 = 0
        L20:
            return r1
    }

    @Override // org.fortheloss.sticknodes.animationscreen.FramesContainer
    public boolean canAddFigures(org.fortheloss.sticknodes.data.IFrameData r8, java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r9) {
            r7 = this;
            int r0 = r7.getTotalNodeCount()
            int r8 = r8.getFrameTotalNodeCount()
            int r1 = r9.size()
            r2 = 1
            int r1 = r1 - r2
            r3 = 0
            r4 = 0
        L10:
            if (r1 < 0) goto L25
            java.lang.Object r5 = r9.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r5 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r5
            boolean r6 = r5 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r6 == 0) goto L1d
            goto L22
        L1d:
            int r5 = r5.getNodeCount(r2)
            int r4 = r4 + r5
        L22:
            int r1 = r1 + (-1)
            goto L10
        L25:
            int r0 = r0 + r4
            r9 = 256000(0x3e800, float:3.58732E-40)
            if (r0 > r9) goto L33
            int r8 = r8 + r4
            int r9 = org.fortheloss.sticknodes.App.getMaxNodesPerFrame()
            if (r8 > r9) goto L33
            goto L34
        L33:
            r2 = 0
        L34:
            return r2
    }

    @Override // org.fortheloss.sticknodes.animationscreen.FramesContainer
    public boolean canAddFrame(org.fortheloss.sticknodes.data.IFrameData r4) {
            r3 = this;
            int r4 = r4.getFrameTotalNodeCount()
            int r0 = r3.getTotalNodeCount()
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r3.frames
            int r1 = r1.size()
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 >= r2) goto L1a
            int r0 = r0 + r4
            r4 = 256000(0x3e800, float:3.58732E-40)
            if (r0 > r4) goto L1a
            r4 = 1
            goto L1b
        L1a:
            r4 = 0
        L1b:
            return r4
    }

    @Override // org.fortheloss.sticknodes.animationscreen.FramesContainer
    public boolean canAddFrames(org.fortheloss.sticknodes.data.IFrameData r3, int r4) {
            r2 = this;
            int r3 = r3.getFrameTotalNodeCount()
            int r3 = r3 * r4
            int r0 = r2.getTotalNodeCount()
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r2.frames
            int r1 = r1.size()
            int r1 = r1 + r4
            r4 = 200(0xc8, float:2.8E-43)
            if (r1 > r4) goto L1d
            int r0 = r0 + r3
            r3 = 256000(0x3e800, float:3.58732E-40)
            if (r0 > r3) goto L1d
            r3 = 1
            goto L1e
        L1d:
            r3 = 0
        L1e:
            return r3
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r4 = this;
            r0 = 0
            r4._name = r0
            r4._savingLoadingStatusString = r0
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r4.frames
            r2 = 1
            if (r1 == 0) goto L21
            int r1 = r1.size()
            int r1 = r1 - r2
        Lf:
            if (r1 < 0) goto L1f
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r3 = r4.frames
            java.lang.Object r3 = r3.get(r1)
            org.fortheloss.sticknodes.data.IFrameData r3 = (org.fortheloss.sticknodes.data.IFrameData) r3
            r3.dispose()
            int r1 = r1 + (-1)
            goto Lf
        L1f:
            r4.frames = r0
        L21:
            r4._soundsNotFoundFilenames = r0
            r4._nextFrameStickfigureIndicesForTweening = r0
            r4._thisFrameStickfigureIndicesForTweening = r0
            r4._disposed = r2
            return
    }

    public int getAverageNodeCount() {
            r1 = this;
            int r0 = r1._averageNodeCount
            return r0
    }

    public java.util.ArrayList<java.lang.Integer> getIndicesForNextFrameFiguresFromFrame(int r6) {
            r5 = this;
            java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> r0 = r5._nextFrameStickfigureIndicesForTweening
            if (r0 != 0) goto L28
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r1 = r5._disposed
            int r2 = r5._libraryID
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "disposed_"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = "_libID_"
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "mc_next_frame_indices_crash"
            r0.setCrashlyticsKeyString(r2, r1)
        L28:
            java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> r0 = r5._nextFrameStickfigureIndicesForTweening
            java.lang.Object r6 = r0.get(r6)
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            return r6
    }

    public java.util.ArrayList<java.lang.Integer> getIndicesForOrderOfTweeningOfFrame(int r6) {
            r5 = this;
            java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> r0 = r5._thisFrameStickfigureIndicesForTweening
            if (r0 != 0) goto L28
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r1 = r5._disposed
            int r2 = r5._libraryID
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "disposed_"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = "_libID_"
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "mc_this_frame_indices_crash"
            r0.setCrashlyticsKeyString(r2, r1)
        L28:
            java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> r0 = r5._thisFrameStickfigureIndicesForTweening
            java.lang.Object r6 = r0.get(r6)
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            return r6
    }

    public int getLibraryID() {
            r1 = this;
            int r0 = r1._libraryID
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1._name
            return r0
    }

    public synchronized java.lang.String getSavingOpeningStatusText() {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = r1._savingLoadingStatusString     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public java.util.ArrayList<java.lang.String> getSoundsNotFoundFilenames() {
            r1 = this;
            java.util.ArrayList<java.lang.String> r0 = r1._soundsNotFoundFilenames
            return r0
    }

    public int getTotalNodeCount() {
            r3 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r3.frames
            int r0 = r0.size()
            int r0 = r0 + (-1)
            r1 = 0
        L9:
            if (r0 < 0) goto L1b
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r2 = r3.frames
            java.lang.Object r2 = r2.get(r0)
            org.fortheloss.sticknodes.data.IFrameData r2 = (org.fortheloss.sticknodes.data.IFrameData) r2
            int r2 = r2.getFrameTotalNodeCount()
            int r1 = r1 + r2
            int r0 = r0 + (-1)
            goto L9
        L1b:
            return r1
    }

    public boolean getTweenLoopProtectionEnabled() {
            r1 = this;
            boolean r0 = r1._tweenLoopProtectionEnabled
            return r0
    }

    public boolean open(com.badlogic.gdx.files.FileHandle r31, org.fortheloss.sticknodes.data.ProjectData r32, boolean r33) {
            r30 = this;
            r1 = r30
            r10 = r32
            java.lang.String r2 = "statusImportingMC1"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r11 = "..."
            r3.append(r11)
            java.lang.String r2 = r3.toString()
            r1.setSavingOpeningStatusText(r2)
            r12 = 0
            if (r31 == 0) goto L571
            boolean r2 = r31.exists()
            if (r2 != 0) goto L29
            goto L571
        L29:
            boolean r2 = org.fortheloss.sticknodes.App.checkIfContainsNonsenseData(r31)
            r14 = 1
            java.io.InputStream r3 = r31.read()     // Catch: java.lang.Exception -> L51
            java.io.DataInputStream r4 = new java.io.DataInputStream     // Catch: java.lang.Exception -> L51
            r4.<init>(r3)     // Catch: java.lang.Exception -> L51
            if (r2 == 0) goto L3e
            r5 = 9
            r3.skip(r5)     // Catch: java.lang.Exception -> L4e
        L3e:
            java.util.zip.GZIPInputStream r2 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Exception -> L4e
            r5 = 4096(0x1000, float:5.74E-42)
            r2.<init>(r3, r5)     // Catch: java.lang.Exception -> L4e
            java.io.DataInputStream r3 = new java.io.DataInputStream     // Catch: java.lang.Exception -> L4e
            r3.<init>(r2)     // Catch: java.lang.Exception -> L4e
            r15 = r3
            r16 = 1
            goto L5a
        L4e:
            r0 = move-exception
            r2 = r0
            goto L54
        L51:
            r0 = move-exception
            r2 = r0
            r4 = 0
        L54:
            r2.printStackTrace()
            r15 = r4
            r16 = 0
        L5a:
            if (r16 == 0) goto L563
            java.lang.String r2 = "statusImportingMC2"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r3.<init>()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r3.append(r2)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r3.append(r11)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r1.setSavingOpeningStatusText(r2)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            int r9 = r15.readInt()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            int r2 = org.fortheloss.sticknodes.movieclip.MCMovieclipSource.DEBUG_IMPORT_FLAG     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            if (r2 != 0) goto L88
            r2 = 402(0x192, float:5.63E-43)
            if (r9 < r2) goto L85
            int r2 = r15.readInt()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            goto L86
        L85:
            r2 = 1
        L86:
            r7 = r2
            goto L8d
        L88:
            if (r2 != r14) goto L8c
            r7 = 1
            goto L8d
        L8c:
            r7 = 2
        L8d:
            java.io.PrintStream r2 = java.lang.System.out     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r3.<init>()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            java.lang.String r4 = "Opening movieclip made with version "
            r3.append(r4)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r3.append(r9)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            java.lang.String r4 = ", build "
            r3.append(r4)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r3.append(r7)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r2.println(r3)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r2 = 425(0x1a9, float:5.96E-43)
            if (r9 <= r2) goto Lb6
            org.jcodec.common.io.IOUtils.closeQuietly(r15)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            org.jcodec.common.io.IOUtils.closeQuietly(r15)
            return r12
        Lb6:
            int r2 = r15.readInt()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            byte[] r3 = new byte[r2]     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r15.readFully(r3, r12, r2)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r1._name = r2     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            java.lang.String r2 = r31.nameWithoutExtension()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r1._name = r2     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            int r6 = r15.readInt()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            int r2 = r15.readInt()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r3 = 400(0x190, float:5.6E-43)
            if (r9 < r3) goto Ldd
            int r4 = r15.readInt()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            goto Lde
        Ldd:
            r4 = 0
        Lde:
            int r5 = r15.readInt()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            int r17 = r15.readInt()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            int r18 = r15.readInt()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            int r19 = r15.readInt()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            int r18 = r18 * r19
            int r18 = r18 * 4
            int r13 = r18 * r17
            r15.skipBytes(r13)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            int r13 = r15.readInt()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r1.fps = r13     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            int r13 = r15.readInt()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r1.numTweenedFrames = r13     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            int r13 = r15.read()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            if (r13 == 0) goto L10b
            r13 = 1
            goto L10c
        L10b:
            r13 = 0
        L10c:
            r1.tweeningEnabled = r13     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            int r13 = r15.read()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            if (r13 == 0) goto L116
            r13 = 1
            goto L117
        L116:
            r13 = 0
        L117:
            r1._tweenLoopProtectionEnabled = r13     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            int r13 = r15.readInt()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r1._uniqueFigureID = r13     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            java.lang.String r13 = r1._name     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            java.lang.String r13 = r13.trim()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r3.<init>()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
        L12a:
            int r8 = r13.length()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            if (r12 >= r8) goto L149
            char r8 = r13.charAt(r12)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            boolean r20 = java.lang.Character.isLetterOrDigit(r8)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            if (r20 == 0) goto L13d
            r3.append(r8)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
        L13d:
            int r8 = r3.length()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r14 = 5
            if (r8 < r14) goto L145
            goto L149
        L145:
            int r12 = r12 + 1
            r14 = 1
            goto L12a
        L149:
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            int r8 = r3.length()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r12 = 1
            if (r8 > r12) goto L182
            double r12 = java.lang.Math.random()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r21 = 4621256167635550208(0x4022000000000000, double:9.0)
            double r12 = r12 * r21
            int r3 = (int) r12     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            double r12 = java.lang.Math.random()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            double r12 = r12 * r21
            int r8 = (int) r12     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            double r12 = java.lang.Math.random()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            double r12 = r12 * r21
            int r12 = (int) r12     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r13.<init>()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            java.lang.String r14 = "mc"
            r13.append(r14)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r13.append(r3)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r13.append(r8)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r13.append(r12)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            java.lang.String r3 = r13.toString()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
        L182:
            int[] r12 = new int[r2]     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            int[] r13 = new int[r4]     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r8 = 0
        L187:
            java.lang.String r14 = ")"
            r21 = r6
            java.lang.String r6 = " ("
            r22 = r5
            java.lang.String r5 = "_"
            if (r8 >= r2) goto L245
            r23 = r13
            java.lang.String r13 = "statusImportingMC3"
            r25 = r4
            r24 = r7
            r7 = 2
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            int r7 = r8 + 1
            java.lang.Integer r26 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r17 = 0
            r4[r17] = r26     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            java.lang.Integer r26 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r20 = 1
            r4[r20] = r26     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r13, r4)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r13.<init>()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r13.append(r4)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r13.append(r11)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            java.lang.String r4 = r13.toString()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r1.setSavingOpeningStatusText(r4)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            int r4 = r15.readInt()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            byte[] r13 = new byte[r4]     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r26 = r2
            r2 = 0
            r15.readFully(r13, r2, r4)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r2.<init>(r13)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = new org.fortheloss.sticknodes.stickfigure.Stickfigure     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r4.<init>()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r4.readData(r15)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r13.<init>()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r13.append(r3)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r13.append(r5)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r13.append(r2)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r4.setName(r13)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r13 = 1
        L1f5:
            boolean r27 = r10.addStickfigureToLibrary(r4)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            if (r27 != 0) goto L220
            r27 = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r7.<init>()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r7.append(r3)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r7.append(r5)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r7.append(r2)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r7.append(r6)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r7.append(r13)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r7.append(r14)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r4.setName(r7)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            int r13 = r13 + 1
            r7 = r27
            goto L1f5
        L220:
            r27 = r7
            if (r33 == 0) goto L22f
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r2 = r10.libraryStickfigures     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r5 = 1
            int r2 = r2 - r5
            r10.hideStickfigureInImportList(r2, r5)     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
        L22f:
            int r2 = r4.getLibraryID()     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r12[r8] = r2     // Catch: java.lang.Throwable -> L537 java.lang.Exception -> L53b java.lang.OutOfMemoryError -> L549
            r6 = r21
            r5 = r22
            r13 = r23
            r7 = r24
            r4 = r25
            r2 = r26
            r8 = r27
            goto L187
        L245:
            r25 = r4
            r24 = r7
            r23 = r13
            r2 = 400(0x190, float:5.6E-43)
            if (r9 < r2) goto L37c
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r2.<init>()     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r4.<init>()     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r8 = r25
            r7 = 0
        L25c:
            if (r7 >= r8) goto L362
            java.lang.String r13 = "statusImportingMC3_3"
            r25 = r12
            r31 = r14
            r12 = 2
            java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            int r12 = r7 + 1
            java.lang.Integer r26 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r17 = 0
            r14[r17] = r26     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            java.lang.Integer r26 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r20 = 1
            r14[r20] = r26     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r13, r14)     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r14.<init>()     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r14.append(r13)     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r14.append(r11)     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            java.lang.String r13 = r14.toString()     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r1.setSavingOpeningStatusText(r13)     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            int r13 = r15.read()     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            if (r13 == 0) goto L297
            r13 = 1
            goto L298
        L297:
            r13 = 0
        L298:
            int r14 = r15.readInt()     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r26 = r8
            byte[] r8 = new byte[r14]     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r27 = r12
            r12 = 0
            r15.readFully(r8, r12, r14)     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            java.lang.String r12 = new java.lang.String     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r12.<init>(r8)     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            int r8 = r15.readInt()     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r14.<init>()     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r14.append(r3)     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r14.append(r5)     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r14.append(r12)     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            java.lang.String r12 = r14.toString()     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r28 = r3
            r29 = r5
            r3 = r12
            r14 = 1
        L2c7:
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r5 = r10.librarySprites     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r20 = 1
            int r5 = r5 + (-1)
        L2d1:
            if (r5 < 0) goto L2ec
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r1 = r10.librarySprites     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            org.fortheloss.sticknodes.sprite.ISpriteSource r1 = (org.fortheloss.sticknodes.sprite.ISpriteSource) r1     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            boolean r1 = r1.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            if (r1 == 0) goto L2e7
            r1 = 0
            goto L2ed
        L2e7:
            int r5 = r5 + (-1)
            r1 = r30
            goto L2d1
        L2ec:
            r1 = 1
        L2ed:
            if (r1 == 0) goto L33e
            if (r13 == 0) goto L2fa
            org.fortheloss.sticknodes.sprite.SpriteGroupSource r1 = new org.fortheloss.sticknodes.sprite.SpriteGroupSource     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r4.add(r1)     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            goto L2ff
        L2fa:
            org.fortheloss.sticknodes.sprite.SpriteSource r1 = new org.fortheloss.sticknodes.sprite.SpriteSource     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
        L2ff:
            r5 = r24
            r1.readLibraryData(r9, r5, r15)     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r10.addSpriteToLibrary(r1)     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r8 = r10.librarySprites     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            int r8 = r8.size()     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r12 = 1
            int r8 = r8 - r12
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r2.put(r3, r8)     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            if (r33 == 0) goto L326
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r3 = r10.librarySprites     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            int r3 = r3 - r12
            r10.hideSpriteInImportList(r3, r12)     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
        L326:
            int r1 = r1.getLibraryId()     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r23[r7] = r1     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r1 = r30
            r14 = r31
            r24 = r5
            r12 = r25
            r8 = r26
            r7 = r27
            r3 = r28
            r5 = r29
            goto L25c
        L33e:
            r5 = r24
            int r1 = r14 + 1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r3.<init>()     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r3.append(r12)     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r3.append(r6)     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r3.append(r14)     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r14 = r31
            r3.append(r14)     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r24 = r5
            r31 = r14
            r14 = r1
            r1 = r30
            goto L2c7
        L362:
            r25 = r12
            r5 = r24
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r3 = 1
            int r1 = r1 - r3
        L36c:
            if (r1 < 0) goto L380
            java.lang.Object r3 = r4.get(r1)     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            org.fortheloss.sticknodes.sprite.SpriteGroupSource r3 = (org.fortheloss.sticknodes.sprite.SpriteGroupSource) r3     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r6 = r10.librarySprites     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r3.rebuildStates(r6, r2)     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            int r1 = r1 + (-1)
            goto L36c
        L37c:
            r25 = r12
            r5 = r24
        L380:
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            boolean r1 = r1.isPro()     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r2 = r22
            int[] r12 = new int[r2]     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r3 = 0
        L38b:
            if (r3 >= r2) goto L430
            java.lang.String r4 = "statusImportingMC4"
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            int r6 = r3 + 1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r13 = 0
            r7[r13] = r8     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r13 = 1
            r7[r13] = r8     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4, r7)     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r7.<init>()     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r7.append(r4)     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r7.append(r11)     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            java.lang.String r4 = r7.toString()     // Catch: java.lang.Throwable -> L52b java.lang.Exception -> L52f java.lang.OutOfMemoryError -> L533
            r13 = r30
            r13.setSavingOpeningStatusText(r4)     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            int r4 = r15.readInt()     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            byte[] r7 = new byte[r4]     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            r8 = 0
            r15.readFully(r7, r8, r4)     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            r4.<init>(r7)     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            if (r1 == 0) goto L425
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r8 = r10.librarySoundDatas     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            int r8 = r8.size()     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            r14 = 1
            int r8 = r8 - r14
        L3d3:
            if (r8 < 0) goto L3eb
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r14 = r10.librarySoundDatas     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            java.lang.Object r14 = r14.get(r8)     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            org.fortheloss.sticknodes.data.SoundData r14 = (org.fortheloss.sticknodes.data.SoundData) r14     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            java.lang.String r14 = r14.fileName     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            boolean r14 = r14.equalsIgnoreCase(r4)     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            if (r14 == 0) goto L3e8
            r12[r3] = r8     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            goto L42d
        L3e8:
            int r8 = r8 + (-1)
            goto L3d3
        L3eb:
            com.badlogic.gdx.Files r8 = com.badlogic.gdx.Gdx.files     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            java.lang.String r14 = org.fortheloss.sticknodes.App.soundsPath     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            r7.<init>()     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            r7.append(r14)     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            r7.append(r4)     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            com.badlogic.gdx.files.FileHandle r7 = r8.absolute(r7)     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            boolean r8 = r7.exists()     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            if (r8 == 0) goto L40d
            int r7 = r10.importSound(r7)     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            goto L40e
        L40d:
            r7 = 0
        L40e:
            r8 = 1
            if (r7 == r8) goto L41a
            java.util.ArrayList<java.lang.String> r7 = r13._soundsNotFoundFilenames     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            r7.add(r4)     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            r4 = -1
            r12[r3] = r4     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            goto L42d
        L41a:
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r4 = r10.librarySoundDatas     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            int r4 = r4.size()     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            r7 = 1
            int r4 = r4 - r7
            r12[r3] = r4     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            goto L42d
        L425:
            java.util.ArrayList<java.lang.String> r7 = r13._soundsNotFoundFilenames     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            r7.add(r4)     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            r4 = -1
            r12[r3] = r4     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
        L42d:
            r3 = r6
            goto L38b
        L430:
            r13 = r30
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r13.frames     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            org.fortheloss.sticknodes.data.IFrameData r1 = (org.fortheloss.sticknodes.data.IFrameData) r1     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            r1.dispose()     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r13.frames     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            r1.clear()     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            r6 = r21
            r1 = 0
        L446:
            if (r1 >= r6) goto L49b
            java.lang.String r2 = "statusImportingMC5"
            r8 = 2
            java.lang.Object[] r3 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            int r1 = r1 + 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            r7 = 0
            r3[r7] = r4     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            r7 = 1
            r3[r7] = r4     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2, r3)     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            r3.<init>()     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            r3.append(r2)     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            r3.append(r11)     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            r13.setSavingOpeningStatusText(r2)     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            org.fortheloss.sticknodes.data.MCFrameData r14 = new org.fortheloss.sticknodes.data.MCFrameData     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            r14.<init>()     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            r2 = r14
            r3 = r9
            r4 = r5
            r7 = r5
            r5 = r32
            r18 = r6
            r6 = r15
            r21 = r7
            r7 = r25
            r22 = 2
            r8 = r23
            r24 = r9
            r9 = r12
            r2.readData(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r2 = r13.frames     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            r2.add(r14)     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            r6 = r18
            r5 = r21
            r9 = r24
            goto L446
        L49b:
            java.lang.String r1 = "statusFinishing"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            r2.<init>()     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            r2.append(r1)     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            r2.append(r11)     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            r13.setSavingOpeningStatusText(r1)     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r13.frames     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            int r1 = r1.size()     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            r2 = 0
            r3 = 0
        L4bb:
            if (r2 >= r1) goto L564
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r4 = r13.frames     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            org.fortheloss.sticknodes.data.IFrameData r4 = (org.fortheloss.sticknodes.data.IFrameData) r4     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            if (r2 != 0) goto L4d7
            r5 = 1
            if (r1 <= r5) goto L4d5
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r5 = r13.frames     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            int r6 = r1 + (-1)
            java.lang.Object r5 = r5.get(r6)     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
        L4d2:
            org.fortheloss.sticknodes.data.IFrameData r5 = (org.fortheloss.sticknodes.data.IFrameData) r5     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            goto L4e0
        L4d5:
            r5 = 0
            goto L4e0
        L4d7:
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r5 = r13.frames     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            int r6 = r2 + (-1)
            java.lang.Object r5 = r5.get(r6)     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            goto L4d2
        L4e0:
            int r6 = r1 + (-1)
            if (r2 != r6) goto L4f3
            r7 = 1
            if (r1 <= r7) goto L4f1
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r7 = r13.frames     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            r8 = 0
            java.lang.Object r7 = r7.get(r8)     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
        L4ee:
            org.fortheloss.sticknodes.data.IFrameData r7 = (org.fortheloss.sticknodes.data.IFrameData) r7     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            goto L4fc
        L4f1:
            r7 = 0
            goto L4fc
        L4f3:
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r7 = r13.frames     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            int r8 = r2 + 1
            java.lang.Object r7 = r7.get(r8)     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            goto L4ee
        L4fc:
            r4.restoreReferences(r5, r7)     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            if (r2 != r6) goto L505
            r5 = 1
            r4.setIsLastFrame(r5)     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
        L505:
            java.util.ArrayList r4 = r4.getDrawableFigures()     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            int r5 = r4.size()     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            r6 = 1
            int r5 = r5 - r6
        L50f:
            if (r5 < 0) goto L524
            java.lang.Object r7 = r4.get(r5)     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r7 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r7     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            int r8 = r7.getID()     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
            if (r8 <= r3) goto L521
            int r3 = r7.getID()     // Catch: java.lang.Exception -> L527 java.lang.OutOfMemoryError -> L529 java.lang.Throwable -> L55b
        L521:
            int r5 = r5 + (-1)
            goto L50f
        L524:
            int r2 = r2 + 1
            goto L4bb
        L527:
            r0 = move-exception
            goto L53d
        L529:
            r0 = move-exception
            goto L54b
        L52b:
            r0 = move-exception
            r13 = r30
            goto L539
        L52f:
            r0 = move-exception
            r13 = r30
            goto L53d
        L533:
            r0 = move-exception
            r13 = r30
            goto L54b
        L537:
            r0 = move-exception
            r13 = r1
        L539:
            r1 = r0
            goto L55d
        L53b:
            r0 = move-exception
            r13 = r1
        L53d:
            r1 = r0
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform     // Catch: java.lang.Throwable -> L55b
            r2.logNonFatalException(r1)     // Catch: java.lang.Throwable -> L55b
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L55b
            if (r15 == 0) goto L559
            goto L556
        L549:
            r0 = move-exception
            r13 = r1
        L54b:
            r1 = r0
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform     // Catch: java.lang.Throwable -> L55b
            r2.logNonFatalException(r1)     // Catch: java.lang.Throwable -> L55b
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L55b
            if (r15 == 0) goto L559
        L556:
            org.jcodec.common.io.IOUtils.closeQuietly(r15)
        L559:
            r12 = 0
            goto L56b
        L55b:
            r0 = move-exception
            goto L539
        L55d:
            if (r15 == 0) goto L562
            org.jcodec.common.io.IOUtils.closeQuietly(r15)
        L562:
            throw r1
        L563:
            r13 = r1
        L564:
            if (r15 == 0) goto L569
            org.jcodec.common.io.IOUtils.closeQuietly(r15)
        L569:
            r12 = r16
        L56b:
            java.lang.String r1 = ""
            r13.setSavingOpeningStatusText(r1)
            return r12
        L571:
            r13 = r1
            r1 = 0
            return r1
    }

    public void readLibraryData(int r7, int r8, org.fortheloss.sticknodes.data.ProjectData r9, java.io.DataInputStream r10) throws java.io.IOException {
            r6 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r6.frames
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            org.fortheloss.sticknodes.data.IFrameData r0 = (org.fortheloss.sticknodes.data.IFrameData) r0
            r0.dispose()
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r6.frames
            r0.clear()
            int r0 = r10.readInt()
            int r2 = r10.readInt()
            r6.fps = r2
            int r2 = r10.readInt()
            r6.numTweenedFrames = r2
            int r2 = r10.read()
            r3 = 1
            if (r2 == 0) goto L2a
            r2 = 1
            goto L2b
        L2a:
            r2 = 0
        L2b:
            r6.tweeningEnabled = r2
            int r2 = r10.read()
            if (r2 == 0) goto L35
            r2 = 1
            goto L36
        L35:
            r2 = 0
        L36:
            r6._tweenLoopProtectionEnabled = r2
            int r2 = r10.readInt()
            r6._uniqueFigureID = r2
            r2 = 0
        L3f:
            if (r2 >= r0) goto L51
            org.fortheloss.sticknodes.data.MCFrameData r4 = new org.fortheloss.sticknodes.data.MCFrameData
            r4.<init>()
            r4.readLibraryData(r7, r8, r9, r10)
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r5 = r6.frames
            r5.add(r4)
            int r2 = r2 + 1
            goto L3f
        L51:
            r7 = 0
        L52:
            if (r7 >= r0) goto L94
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r8 = r6.frames
            java.lang.Object r8 = r8.get(r7)
            org.fortheloss.sticknodes.data.IFrameData r8 = (org.fortheloss.sticknodes.data.IFrameData) r8
            r9 = 0
            if (r7 != 0) goto L68
            if (r0 <= r3) goto L66
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r10 = r6.frames
            int r2 = r0 + (-1)
            goto L6c
        L66:
            r10 = r9
            goto L72
        L68:
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r10 = r6.frames
            int r2 = r7 + (-1)
        L6c:
            java.lang.Object r10 = r10.get(r2)
            org.fortheloss.sticknodes.data.IFrameData r10 = (org.fortheloss.sticknodes.data.IFrameData) r10
        L72:
            int r2 = r0 + (-1)
            if (r7 != r2) goto L7f
            if (r0 <= r3) goto L89
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r9 = r6.frames
            java.lang.Object r9 = r9.get(r1)
            goto L87
        L7f:
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r9 = r6.frames
            int r4 = r7 + 1
            java.lang.Object r9 = r9.get(r4)
        L87:
            org.fortheloss.sticknodes.data.IFrameData r9 = (org.fortheloss.sticknodes.data.IFrameData) r9
        L89:
            r8.restoreReferences(r10, r9)
            if (r7 != r2) goto L91
            r8.setIsLastFrame(r3)
        L91:
            int r7 = r7 + 1
            goto L52
        L94:
            return
    }

    public void recalculateAllNextFrameStickfigureIndicesForTweening() {
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r12.frames
            int r1 = r1.size()
            r0.<init>(r1)
            r12._nextFrameStickfigureIndicesForTweening = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r12.frames
            int r1 = r1.size()
            r0.<init>(r1)
            r12._thisFrameStickfigureIndicesForTweening = r0
            r0 = 0
            r12._averageNodeCount = r0
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r12.frames
            int r1 = r1.size()
            r2 = 1
            if (r1 != r2) goto L41
            java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> r1 = r12._nextFrameStickfigureIndicesForTweening
            r2 = 0
            r1.add(r2)
            java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> r1 = r12._thisFrameStickfigureIndicesForTweening
            r1.add(r2)
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r12.frames
            java.lang.Object r0 = r1.get(r0)
            org.fortheloss.sticknodes.data.IFrameData r0 = (org.fortheloss.sticknodes.data.IFrameData) r0
            int r0 = r0.getFrameTotalNodeCount()
            r12._averageNodeCount = r0
            goto L151
        L41:
            r1 = 0
        L42:
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r3 = r12.frames
            int r3 = r3.size()
            int r3 = r3 - r2
            if (r1 > r3) goto L146
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r3 = r12.frames
            java.lang.Object r3 = r3.get(r1)
            org.fortheloss.sticknodes.data.MCFrameData r3 = (org.fortheloss.sticknodes.data.MCFrameData) r3
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r4 = r12.frames
            int r4 = r4.size()
            int r4 = r4 - r2
            if (r1 >= r4) goto L61
            org.fortheloss.sticknodes.data.MCFrameData r4 = r3.getNextFrame()
            goto L69
        L61:
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r4 = r12.frames
            java.lang.Object r4 = r4.get(r0)
            org.fortheloss.sticknodes.data.MCFrameData r4 = (org.fortheloss.sticknodes.data.MCFrameData) r4
        L69:
            int r5 = r12._averageNodeCount
            int r6 = r3.getFrameTotalNodeCount()
            int r5 = r5 + r6
            r12._averageNodeCount = r5
            java.util.ArrayList r5 = r3.getTweenedDrawableFigures()
            int r5 = r5.size()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r5)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r5)
            java.util.ArrayList r3 = r3.getDrawableFigures()
            java.util.ArrayList r4 = r4.getDrawableFigures()
            java.lang.Class<java.util.ArrayList> r5 = java.util.ArrayList.class
            java.lang.Object r5 = com.badlogic.gdx.utils.Pools.obtain(r5)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r8 = r3.size()
            int r8 = r8 - r2
        L99:
            if (r8 < 0) goto Ld2
            java.lang.Object r9 = r3.get(r8)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r9 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r9
            boolean r10 = r9.isJoined()
            if (r10 == 0) goto Lc0
            org.fortheloss.sticknodes.stickfigure.StickNode r9 = r9.getJoinedToNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r9 = r9.getStickfigure()
            r10 = 0
        Lb0:
            int r10 = r10 + r2
            boolean r11 = r9.isJoined()
            if (r11 == 0) goto Lc1
            org.fortheloss.sticknodes.stickfigure.StickNode r9 = r9.getJoinedToNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r9 = r9.getStickfigure()
            goto Lb0
        Lc0:
            r10 = 0
        Lc1:
            java.lang.Class<org.fortheloss.framework.Int2> r9 = org.fortheloss.framework.Int2.class
            java.lang.Object r9 = com.badlogic.gdx.utils.Pools.obtain(r9)
            org.fortheloss.framework.Int2 r9 = (org.fortheloss.framework.Int2) r9
            r9.set(r8, r10)
            r5.add(r9)
            int r8 = r8 + (-1)
            goto L99
        Ld2:
            java.util.Comparator r8 = org.fortheloss.framework.Int2.getComparatorY()
            java.util.Collections.sort(r5, r8)
            int r8 = r5.size()
            r9 = 0
        Lde:
            if (r9 >= r8) goto Lf5
            java.lang.Object r10 = r5.get(r9)
            org.fortheloss.framework.Int2 r10 = (org.fortheloss.framework.Int2) r10
            int r11 = r10.x
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r6.add(r11)
            com.badlogic.gdx.utils.Pools.free(r10)
            int r9 = r9 + 1
            goto Lde
        Lf5:
            r5.clear()
            com.badlogic.gdx.utils.Pools.free(r5)
            int r5 = r6.size()
            r8 = 0
        L100:
            if (r8 >= r5) goto L138
            java.lang.Object r9 = r6.get(r8)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            java.lang.Object r9 = r3.get(r9)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r9 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r9
            int r9 = r9.getID()
            int r10 = r4.size()
            int r10 = r10 - r2
        L11b:
            if (r10 < 0) goto L12d
            java.lang.Object r11 = r4.get(r10)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r11 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r11
            int r11 = r11.getID()
            if (r11 != r9) goto L12a
            goto L12e
        L12a:
            int r10 = r10 + (-1)
            goto L11b
        L12d:
            r10 = -1
        L12e:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r7.add(r9)
            int r8 = r8 + 1
            goto L100
        L138:
            java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> r3 = r12._thisFrameStickfigureIndicesForTweening
            r3.add(r6)
            java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> r3 = r12._nextFrameStickfigureIndicesForTweening
            r3.add(r7)
            int r1 = r1 + 1
            goto L42
        L146:
            int r0 = r12._averageNodeCount
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r12.frames
            int r1 = r1.size()
            int r0 = r0 / r1
            r12._averageNodeCount = r0
        L151:
            return
    }

    public boolean save(java.lang.String r32, org.fortheloss.sticknodes.data.ProjectData r33, com.badlogic.gdx.scenes.scene2d.Stage r34, org.fortheloss.sticknodes.SNShapeRenderer r35, com.badlogic.gdx.graphics.g2d.SpriteBatch r36, org.fortheloss.framework.Assets r37) {
            r31 = this;
            r9 = r31
            r1 = r32
            r10 = r33
            java.lang.String r0 = "statusSavingMC1"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r11 = "..."
            r2.append(r11)
            java.lang.String r0 = r2.toString()
            r9.setSavingOpeningStatusText(r0)
            java.lang.String r0 = org.fortheloss.sticknodes.App.movieclipsPath
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = ".nodemc"
            r2.append(r0)
            java.lang.String r12 = r2.toString()
            java.lang.String r2 = org.fortheloss.sticknodes.App.tempPath
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "tempSavedMovieclipFile.nodemc"
            r3.append(r2)
            java.lang.String r13 = r3.toString()
            java.lang.String r2 = org.fortheloss.sticknodes.App.tempPath
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r1)
            r3.append(r0)
            java.lang.String r14 = r3.toString()
            r16 = 0
            r8 = 1
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L70 java.io.FileNotFoundException -> L75
            r0.<init>(r13)     // Catch: java.io.IOException -> L70 java.io.FileNotFoundException -> L75
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch: java.io.IOException -> L70 java.io.FileNotFoundException -> L75
            r3 = 4096(0x1000, float:5.74E-42)
            r2.<init>(r0, r3)     // Catch: java.io.IOException -> L70 java.io.FileNotFoundException -> L75
            r7 = r2
            r17 = 1
            goto L7c
        L70:
            r0 = move-exception
            r0.printStackTrace()
            goto L79
        L75:
            r0 = move-exception
            r0.printStackTrace()
        L79:
            r7 = 0
            r17 = 0
        L7c:
            if (r17 == 0) goto L493
            java.lang.String r0 = "statusSavingMC2"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            r2.<init>()     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            r2.append(r0)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            r2.append(r11)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            r9.setSavingOpeningStatusText(r0)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            r0 = 425(0x1a9, float:5.96E-43)
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r7)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            r0 = 100
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r7)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            byte[] r0 = r32.getBytes()     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            int r1 = r0.length     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r1, r7)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            r7.write(r0)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            r0.<init>()     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            r6.<init>()     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            r5.<init>()     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r9.frames     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            int r4 = r1.size()     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            r1 = 0
        Lc1:
            if (r1 >= r4) goto L16f
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r2 = r9.frames     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            org.fortheloss.sticknodes.data.IFrameData r2 = (org.fortheloss.sticknodes.data.IFrameData) r2     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            java.util.ArrayList r2 = r2.getDrawableFigures()     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            int r3 = r3 - r8
        Ld4:
            if (r3 < 0) goto L14b
            java.lang.Object r18 = r2.get(r3)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            r15 = r18
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r15 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r15     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            int r18 = r15.getLibraryID()     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            boolean r8 = r15 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            if (r8 == 0) goto Lf8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r18)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            boolean r8 = r0.contains(r8)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            if (r8 != 0) goto Lf8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r18)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            r0.add(r8)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            goto L143
        Lf8:
            boolean r8 = r15 instanceof org.fortheloss.sticknodes.sprite.SpriteRef     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            if (r8 == 0) goto L143
            java.lang.Integer r8 = java.lang.Integer.valueOf(r18)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            boolean r8 = r6.contains(r8)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            if (r8 != 0) goto L143
            java.lang.Integer r8 = java.lang.Integer.valueOf(r18)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            r6.add(r8)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            boolean r8 = r15 instanceof org.fortheloss.sticknodes.sprite.SpriteGroupRef     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            if (r8 == 0) goto L143
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r15 = (org.fortheloss.sticknodes.sprite.SpriteGroupRef) r15     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            java.util.ArrayList r8 = r15.getStates()     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            int r15 = r8.size()     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            r18 = 1
            int r15 = r15 + (-1)
        L11f:
            if (r15 < 0) goto L143
            java.lang.Object r18 = r8.get(r15)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            org.fortheloss.sticknodes.sprite.SpriteSource r18 = (org.fortheloss.sticknodes.sprite.SpriteSource) r18     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            int r18 = r18.getLibraryId()     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            r32 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            boolean r2 = r6.contains(r2)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            if (r2 != 0) goto L13e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            r6.add(r2)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
        L13e:
            int r15 = r15 + (-1)
            r2 = r32
            goto L11f
        L143:
            r32 = r2
            int r3 = r3 + (-1)
            r2 = r32
            r8 = 1
            goto Ld4
        L14b:
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r2 = r9.frames     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            org.fortheloss.sticknodes.data.IFrameData r2 = (org.fortheloss.sticknodes.data.IFrameData) r2     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            int r2 = r2.getSoundToPlayLibraryID()     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            if (r2 < 0) goto L16a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            boolean r3 = r5.contains(r3)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            if (r3 != 0) goto L16a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            r5.add(r2)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
        L16a:
            int r1 = r1 + 1
            r8 = 1
            goto Lc1
        L16f:
            int r15 = r0.size()     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            int r8 = r6.size()     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            int r3 = r5.size()     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r4, r7)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r15, r7)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r8, r7)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r3, r7)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            java.lang.String r1 = "statusSavingMC3"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            r2.<init>()     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            r2.append(r1)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            r2.append(r11)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            r9.setSavingOpeningStatusText(r1)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            r20 = 100
            java.lang.Thread.sleep(r20)     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            r1 = 3
            int[] r2 = new int[r1]     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            r18 = -1
            r2[r16] = r18     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            r19 = 1
            r2[r19] = r18     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            r1 = 2
            r2[r1] = r18     // Catch: java.lang.Throwable -> L406 java.lang.Exception -> L40c
            r22 = r12
            r1 = 3
            byte[][] r12 = new byte[r1][]     // Catch: java.lang.Exception -> L403 java.lang.Throwable -> L406
            r2[r16] = r16     // Catch: java.lang.Exception -> L403 java.lang.Throwable -> L406
            r1 = 921600(0xe1000, float:1.291437E-39)
            r23 = r3
            byte[] r3 = new byte[r1]     // Catch: java.lang.Exception -> L403 java.lang.Throwable -> L406
            r12[r16] = r3     // Catch: java.lang.Exception -> L403 java.lang.Throwable -> L406
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r3 = r9.frames     // Catch: java.lang.Exception -> L403 java.lang.Throwable -> L406
            int r3 = r3.size()     // Catch: java.lang.Exception -> L403 java.lang.Throwable -> L406
            r1 = 1
            if (r3 <= r1) goto L1d8
            r2[r1] = r1     // Catch: java.lang.Exception -> L403 java.lang.Throwable -> L406
            r25 = r4
            r3 = 921600(0xe1000, float:1.291437E-39)
            byte[] r4 = new byte[r3]     // Catch: java.lang.Exception -> L403 java.lang.Throwable -> L406
            r12[r1] = r4     // Catch: java.lang.Exception -> L403 java.lang.Throwable -> L406
            r1 = 2
            goto L1db
        L1d8:
            r25 = r4
            r1 = 1
        L1db:
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r3 = r9.frames     // Catch: java.lang.Exception -> L403 java.lang.Throwable -> L406
            int r3 = r3.size()     // Catch: java.lang.Exception -> L403 java.lang.Throwable -> L406
            r4 = 2
            if (r3 <= r4) goto L202
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r3 = r9.frames     // Catch: java.lang.Exception -> L403 java.lang.Throwable -> L406
            int r3 = r3.size()     // Catch: java.lang.Exception -> L403 java.lang.Throwable -> L406
            r18 = 3
            int r3 = r3 / 3
            r18 = 1
            r2[r18] = r3     // Catch: java.lang.Exception -> L403 java.lang.Throwable -> L406
            r3 = r2[r18]     // Catch: java.lang.Exception -> L403 java.lang.Throwable -> L406
            int r3 = r3 * 2
            r2[r4] = r3     // Catch: java.lang.Exception -> L403 java.lang.Throwable -> L406
            r3 = 921600(0xe1000, float:1.291437E-39)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Exception -> L403 java.lang.Throwable -> L406
            r12[r4] = r3     // Catch: java.lang.Exception -> L403 java.lang.Throwable -> L406
            int r1 = r1 + 1
            goto L204
        L202:
            r18 = 1
        L204:
            r3 = r1
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource$1 r1 = new org.fortheloss.sticknodes.movieclip.MCMovieclipSource$1     // Catch: java.lang.Exception -> L403 java.lang.Throwable -> L406
            r4 = r1
            r19 = r14
            r14 = 2
            r1 = r4
            r24 = r2
            r2 = r31
            r14 = r3
            r26 = r23
            r3 = r36
            r27 = r13
            r13 = r4
            r4 = r37
            r28 = r5
            r5 = r34
            r29 = r6
            r6 = r35
            r10 = r7
            r7 = r24
            r30 = r8
            r24 = r11
            r11 = 1
            r8 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
            r1.postRunnable(r13)     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
        L233:
            boolean r1 = r13.isDone()     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
            if (r1 != 0) goto L23d
            java.lang.Thread.sleep(r20)     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
            goto L233
        L23d:
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r14, r10)     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
            r1 = 640(0x280, float:8.97E-43)
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r1, r10)     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
            r1 = 360(0x168, float:5.04E-43)
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r1, r10)     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
            r1 = r12[r16]     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
            r10.write(r1)     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
            if (r14 <= r11) goto L256
            r1 = r12[r11]     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
            r10.write(r1)     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
        L256:
            r1 = 2
            if (r14 <= r1) goto L25e
            r2 = r12[r1]     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
            r10.write(r2)     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
        L25e:
            int r1 = r9.fps     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r1, r10)     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
            int r1 = r9.numTweenedFrames     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r1, r10)     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
            boolean r1 = r9.tweeningEnabled     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
            if (r1 == 0) goto L26e
            r8 = 1
            goto L26f
        L26e:
            r8 = 0
        L26f:
            r10.write(r8)     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
            boolean r1 = r9._tweenLoopProtectionEnabled     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
            if (r1 == 0) goto L278
            r8 = 1
            goto L279
        L278:
            r8 = 0
        L279:
            r10.write(r8)     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
            int r1 = r9._uniqueFigureID     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r1, r10)     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
            r1 = 0
        L282:
            if (r1 >= r15) goto L2d7
            java.lang.String r2 = "statusSavingMC4"
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
            int r3 = r1 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
            r4[r16] = r5     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
            r4[r11] = r5     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2, r4)     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
            r4.<init>()     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
            r4.append(r2)     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
            r2 = r24
            r4.append(r2)     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
            r9.setSavingOpeningStatusText(r4)     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
            java.lang.Object r1 = r0.get(r1)     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L3fb java.lang.Exception -> L400
            r4 = r33
            r5 = r10
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r4.getLibraryStickfigure(r1)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            java.lang.String r6 = r1.getName()     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            byte[] r6 = r6.getBytes()     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            int r7 = r6.length     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r7, r5)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            r5.write(r6)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            r1.writeData(r5)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            r24 = r2
            r1 = r3
            r10 = r5
            goto L282
        L2d7:
            r4 = r33
            r5 = r10
            r2 = r24
            r1 = r30
            r3 = 0
        L2df:
            if (r3 >= r1) goto L34d
            java.lang.String r6 = "statusSavingMC4_3"
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            int r7 = r3 + 1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            r8[r16] = r10     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            r8[r11] = r10     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6, r8)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            r8.<init>()     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            r8.append(r6)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            r8.append(r2)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            java.lang.String r6 = r8.toString()     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            r9.setSavingOpeningStatusText(r6)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            r6 = r29
            java.lang.Object r8 = r6.get(r3)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            int r8 = r8.intValue()     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            org.fortheloss.sticknodes.sprite.ISpriteSource r8 = r4.getLibrarySprite(r8)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            boolean r10 = r8 instanceof org.fortheloss.sticknodes.sprite.SpriteGroupSource     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            if (r10 == 0) goto L320
            r10 = 1
            goto L321
        L320:
            r10 = 0
        L321:
            r5.write(r10)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            java.lang.String r10 = r8.getName()     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            byte[] r10 = r10.getBytes()     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            int r12 = r10.length     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r12, r5)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            r5.write(r10)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            java.lang.Object r3 = r6.get(r3)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r3, r5)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            r8.writeLibraryData(r5)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            r29 = r6
            r3 = r7
            goto L2df
        L347:
            r0 = move-exception
            goto L3fd
        L34a:
            r0 = move-exception
            goto L414
        L34d:
            r6 = r29
            r1 = r26
            r3 = 0
        L352:
            if (r3 >= r1) goto L3a2
            java.lang.String r7 = "statusSavingMC5"
            r8 = 2
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            int r8 = r3 + 1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            r10[r16] = r12     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            r10[r11] = r12     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7, r10)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            r10.<init>()     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            r10.append(r7)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            r10.append(r2)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            java.lang.String r7 = r10.toString()     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            r9.setSavingOpeningStatusText(r7)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r7 = r4.librarySoundDatas     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            r10 = r28
            java.lang.Object r3 = r10.get(r3)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            java.lang.Object r3 = r7.get(r3)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            org.fortheloss.sticknodes.data.SoundData r3 = (org.fortheloss.sticknodes.data.SoundData) r3     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            java.lang.String r3 = r3.fileName     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            int r7 = r3.length     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r7, r5)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            r5.write(r3)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            r3 = r8
            r28 = r10
            goto L352
        L3a2:
            r10 = r28
            r1 = r25
            r3 = 0
        L3a7:
            if (r3 >= r1) goto L3df
            java.lang.String r4 = "statusSavingMC6"
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            int r12 = r3 + 1
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            r8[r16] = r13     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            r8[r11] = r13     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4, r8)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            r8.<init>()     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            r8.append(r4)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            r8.append(r2)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            java.lang.String r4 = r8.toString()     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            r9.setSavingOpeningStatusText(r4)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r4 = r9.frames     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            java.lang.Object r3 = r4.get(r3)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            org.fortheloss.sticknodes.data.MCFrameData r3 = (org.fortheloss.sticknodes.data.MCFrameData) r3     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            r3.getData(r5, r0, r6, r10)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            r3 = r12
            goto L3a7
        L3df:
            java.lang.String r0 = "statusFinishing"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            r1.<init>()     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            r1.append(r0)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            r1.append(r2)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            r9.setSavingOpeningStatusText(r0)     // Catch: java.lang.Throwable -> L347 java.lang.Exception -> L34a
            r1 = r27
            goto L499
        L3fb:
            r0 = move-exception
            r5 = r10
        L3fd:
            r16 = r17
            goto L458
        L400:
            r0 = move-exception
            r5 = r10
            goto L414
        L403:
            r0 = move-exception
            r5 = r7
            goto L410
        L406:
            r0 = move-exception
            r5 = r7
            r1 = r13
            r16 = r17
            goto L45a
        L40c:
            r0 = move-exception
            r5 = r7
            r22 = r12
        L410:
            r27 = r13
            r19 = r14
        L414:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L457
            if (r5 == 0) goto L451
            r5.close()     // Catch: java.lang.Throwable -> L42e java.lang.Exception -> L442
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            r1 = r27
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r1)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L453
        L42a:
            r0.delete()
            goto L453
        L42e:
            r0 = move-exception
            r1 = r27
            r2 = r0
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L441
            r0.delete()
        L441:
            throw r2
        L442:
            r1 = r27
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r1)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L453
            goto L42a
        L451:
            r1 = r27
        L453:
            r17 = 0
            goto L4d2
        L457:
            r0 = move-exception
        L458:
            r1 = r27
        L45a:
            if (r5 == 0) goto L492
            r5.close()     // Catch: java.lang.Throwable -> L471 java.lang.Exception -> L485
            if (r16 != 0) goto L492
            com.badlogic.gdx.Files r2 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r1 = r2.absolute(r1)
            boolean r2 = r1.exists()
            if (r2 == 0) goto L492
        L46d:
            r1.delete()
            goto L492
        L471:
            r0 = move-exception
            r2 = r0
            if (r16 != 0) goto L484
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L484
            r0.delete()
        L484:
            throw r2
        L485:
            com.badlogic.gdx.Files r2 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r1 = r2.absolute(r1)
            boolean r2 = r1.exists()
            if (r2 == 0) goto L492
            goto L46d
        L492:
            throw r0
        L493:
            r5 = r7
            r22 = r12
            r1 = r13
            r19 = r14
        L499:
            if (r5 == 0) goto L4d2
            r5.close()     // Catch: java.lang.Throwable -> L4b0 java.lang.Exception -> L4c4
            if (r17 != 0) goto L4d2
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r1)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L4d2
            r0.delete()
            goto L4d2
        L4b0:
            r0 = move-exception
            r2 = r0
            if (r17 != 0) goto L4c3
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L4c3
            r0.delete()
        L4c3:
            throw r2
        L4c4:
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r1)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L453
            goto L42a
        L4d2:
            if (r17 == 0) goto L5c0
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            r2 = r19
            com.badlogic.gdx.files.FileHandle r2 = r0.absolute(r2)
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r1)
            java.io.File r0 = r0.file()
            java.io.File r1 = r2.file()
            com.badlogic.gdx.Files r3 = com.badlogic.gdx.Gdx.files
            r4 = r22
            com.badlogic.gdx.files.FileHandle r3 = r3.absolute(r4)
            java.io.File r3 = r3.file()
            boolean r4 = r0.exists()
            if (r4 == 0) goto L5c0
            boolean r4 = r1.exists()
            if (r4 == 0) goto L505
            r1.delete()
        L505:
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch: java.io.FileNotFoundException -> L51d
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L51d
            r5.<init>(r0)     // Catch: java.io.FileNotFoundException -> L51d
            r4.<init>(r5)     // Catch: java.io.FileNotFoundException -> L51d
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch: java.io.FileNotFoundException -> L51b
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.io.FileNotFoundException -> L51b
            r5.<init>(r1)     // Catch: java.io.FileNotFoundException -> L51b
            r0.<init>(r5)     // Catch: java.io.FileNotFoundException -> L51b
            r15 = r0
            goto L52f
        L51b:
            r0 = move-exception
            goto L51f
        L51d:
            r0 = move-exception
            r4 = 0
        L51f:
            r0.printStackTrace()
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform
            r1.logNonFatalException(r0)
            if (r4 == 0) goto L52c
            org.jcodec.common.io.IOUtils.closeQuietly(r4)
        L52c:
            r15 = 0
            r17 = 0
        L52f:
            if (r17 == 0) goto L5c0
            org.fortheloss.sticknodes.App.writeNonsenseData(r15)     // Catch: java.io.IOException -> L535
            goto L54b
        L535:
            r0 = move-exception
            r1 = r0
            r1.printStackTrace()
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            r0.logNonFatalException(r1)
            if (r4 == 0) goto L544
            org.jcodec.common.io.IOUtils.closeQuietly(r4)
        L544:
            if (r15 == 0) goto L549
            org.jcodec.common.io.IOUtils.closeQuietly(r15)
        L549:
            r17 = 0
        L54b:
            if (r17 == 0) goto L5c0
            org.jcodec.common.io.IOUtils.copy(r4, r15)     // Catch: java.lang.Throwable -> L55d java.io.IOException -> L55f
            if (r4 == 0) goto L555
            org.jcodec.common.io.IOUtils.closeQuietly(r4)
        L555:
            if (r15 == 0) goto L55a
            org.jcodec.common.io.IOUtils.closeQuietly(r15)
        L55a:
            r16 = r17
            goto L573
        L55d:
            r0 = move-exception
            goto L5b5
        L55f:
            r0 = move-exception
            r1 = r0
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L55d
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform     // Catch: java.lang.Throwable -> L55d
            r0.logNonFatalException(r1)     // Catch: java.lang.Throwable -> L55d
            if (r4 == 0) goto L56e
            org.jcodec.common.io.IOUtils.closeQuietly(r4)
        L56e:
            if (r15 == 0) goto L573
            org.jcodec.common.io.IOUtils.closeQuietly(r15)
        L573:
            if (r16 == 0) goto L5b2
            boolean r0 = r3.exists()
            if (r0 == 0) goto L57e
            r3.delete()
        L57e:
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.isChromebook()
            if (r0 != 0) goto L592
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.lang.String r1 = org.fortheloss.sticknodes.App.movieclipsPath
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r1)
            r2.moveTo(r0)
            goto L5b2
        L592:
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L5a0
            java.lang.String r1 = r3.getAbsolutePath()     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L5a0
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r1)     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L5a0
            r2.moveTo(r0)     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L5a0
            goto L5b2
        L5a0:
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r1 = "chromebook_failed_new_saving_method"
            r0.analyticsSendSingle(r1)
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.lang.String r1 = org.fortheloss.sticknodes.App.movieclipsPath
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r1)
            r2.moveTo(r0)
        L5b2:
            r17 = r16
            goto L5c0
        L5b5:
            if (r4 == 0) goto L5ba
            org.jcodec.common.io.IOUtils.closeQuietly(r4)
        L5ba:
            if (r15 == 0) goto L5bf
            org.jcodec.common.io.IOUtils.closeQuietly(r15)
        L5bf:
            throw r0
        L5c0:
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.lang.String r1 = org.fortheloss.sticknodes.App.tempPath
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L5d1
            r0.emptyDirectory()
        L5d1:
            java.lang.String r0 = ""
            r9.setSavingOpeningStatusText(r0)
            return r17
    }

    public void setLibraryID(int r1) {
            r0 = this;
            r0._libraryID = r1
            return
    }

    public void setName(java.lang.String r1) {
            r0 = this;
            r0._name = r1
            return
    }

    public void setTweenLoopProtectionEnabled(boolean r1) {
            r0 = this;
            r0._tweenLoopProtectionEnabled = r1
            return
    }

    public void writeLibraryData(java.io.OutputStream r4) throws java.io.IOException {
            r3 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r3.frames
            int r0 = r0.size()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r4)
            int r1 = r3.fps
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r1, r4)
            int r1 = r3.numTweenedFrames
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r1, r4)
            boolean r1 = r3.tweeningEnabled
            r4.write(r1)
            boolean r1 = r3._tweenLoopProtectionEnabled
            r4.write(r1)
            int r1 = r3._uniqueFigureID
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r1, r4)
            r1 = 0
        L23:
            if (r1 >= r0) goto L33
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r2 = r3.frames
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.data.MCFrameData r2 = (org.fortheloss.sticknodes.data.MCFrameData) r2
            r2.getLibraryData(r4)
            int r1 = r1 + 1
            goto L23
        L33:
            return
    }
}
