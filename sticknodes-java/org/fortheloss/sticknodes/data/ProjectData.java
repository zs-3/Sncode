package org.fortheloss.sticknodes.data;

/* loaded from: classes2.dex */
public class ProjectData extends org.fortheloss.sticknodes.animationscreen.FramesContainer {
    public static int framesContainerUID = 1;
    public static int uniqueMovieclipID;
    public static int uniqueTextfieldBoxID;
    private java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.Integer, java.lang.Integer>>> _idConversionMaps;
    private int[][] _savedCacheLibraryIDs;
    private volatile java.lang.String _savingLoadingStatusString;
    private org.fortheloss.sticknodes.data.SessionSaveData _sessionSaveData;
    public int canvasHeight;
    public int canvasWidth;
    public boolean hasShownLoopMessage;
    public boolean hasShownMagnifierMessage;
    public boolean hasShownPanningModeMessage;
    public boolean hasShownTweeningMessage;
    public java.util.ArrayList<java.lang.Integer> hiddenMovieclipLibraryIDs;
    public java.util.ArrayList<java.lang.Integer> hiddenSpriteLibraryIDs;
    public java.util.ArrayList<java.lang.Integer> hiddenStickfigureLibraryIDs;
    public boolean isYoutubeShorts;
    public java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> libraryMovieclips;
    public java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> librarySoundDatas;
    public java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> librarySprites;
    public java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> libraryStickfigures;
    private org.fortheloss.sticknodes.animationscreen.FontLoader mFontLoader;
    public java.lang.String projectName;
    public java.util.ArrayList<java.lang.String> soundsNotFound;
    public com.badlogic.gdx.graphics.Color watermarkColor;
    public boolean watermarkEnabled;
    public java.lang.String watermarkText;









    /* renamed from: -$$Nest$fgetmFontLoader, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.FontLoader m1302$$Nest$fgetmFontLoader(org.fortheloss.sticknodes.data.ProjectData r0) {
            org.fortheloss.sticknodes.animationscreen.FontLoader r0 = r0.mFontLoader
            return r0
    }

    /* renamed from: -$$Nest$fputmFontLoader, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1303$$Nest$fputmFontLoader(org.fortheloss.sticknodes.data.ProjectData r0, org.fortheloss.sticknodes.animationscreen.FontLoader r1) {
            r0.mFontLoader = r1
            return
    }

    static {
            return
    }

    public ProjectData(org.fortheloss.sticknodes.animationscreen.FontLoader r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.canvasWidth = r0
            r1.canvasHeight = r0
            r1.hasShownPanningModeMessage = r0
            r1.hasShownTweeningMessage = r0
            r1.hasShownLoopMessage = r0
            r1.hasShownMagnifierMessage = r0
            r1.isYoutubeShorts = r0
            r1.watermarkEnabled = r0
            r1.mFontLoader = r2
            return
    }

    private synchronized void setSavingOpeningStatusText(java.lang.String r1, java.lang.Object... r2) {
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

    public boolean addMovieclipToLibrary(org.fortheloss.sticknodes.movieclip.MCMovieclipSource r5) {
            r4 = this;
            java.lang.String r0 = r5.getName()
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r1 = r4.libraryMovieclips
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
        Lc:
            if (r1 < 0) goto L25
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r3 = r4.libraryMovieclips
            java.lang.Object r3 = r3.get(r1)
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r3 = (org.fortheloss.sticknodes.movieclip.MCMovieclipSource) r3
            java.lang.String r3 = r3.getName()
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L22
            r5 = 0
            return r5
        L22:
            int r1 = r1 + (-1)
            goto Lc
        L25:
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r0 = r4.libraryMovieclips
            r0.add(r5)
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r0 = r4.libraryMovieclips
            int r0 = r0.size()
            int r0 = r0 - r2
            r5.setLibraryID(r0)
            return r2
    }

    public boolean addSpriteToLibrary(org.fortheloss.sticknodes.sprite.ISpriteSource r3) {
            r2 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r0 = r2.librarySprites
            r0.add(r3)
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r0 = r2.librarySprites
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
            r3.setLibraryId(r0)
            return r1
    }

    public boolean addStickfigureToLibrary(org.fortheloss.sticknodes.stickfigure.Stickfigure r5) {
            r4 = this;
            java.lang.String r0 = r5.getName()
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r1 = r4.libraryStickfigures
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
        Lc:
            if (r1 < 0) goto L25
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r3 = r4.libraryStickfigures
            java.lang.Object r3 = r3.get(r1)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r3
            java.lang.String r3 = r3.getName()
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L22
            r5 = 0
            return r5
        L22:
            int r1 = r1 + (-1)
            goto Lc
        L25:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r0 = r4.libraryStickfigures
            r0.add(r5)
            r0 = -1
            r5.setID(r0)
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r0 = r4.libraryStickfigures
            int r0 = r0.size()
            int r0 = r0 - r2
            r5.setLibraryID(r0)
            r0 = 0
            r5.setPosition(r0, r0)
            return r2
    }

    @Override // org.fortheloss.sticknodes.animationscreen.FramesContainer
    public boolean canAddFigure(org.fortheloss.sticknodes.data.IFrameData r2, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3) {
            r1 = this;
            int r2 = r2.getFrameTotalNodeCount()
            r0 = 1
            int r3 = r3.getNodeCount(r0)
            int r2 = r2 + r3
            int r3 = org.fortheloss.sticknodes.App.getMaxNodesPerFrame()
            if (r2 <= r3) goto L12
            r2 = 0
            return r2
        L12:
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.FramesContainer
    public boolean canAddFigures(org.fortheloss.sticknodes.data.IFrameData r6, java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r7) {
            r5 = this;
            int r6 = r6.getFrameTotalNodeCount()
            int r0 = r7.size()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = 0
        Lc:
            if (r0 < 0) goto L1c
            java.lang.Object r4 = r7.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r4
            int r4 = r4.getNodeCount(r1)
            int r3 = r3 + r4
            int r0 = r0 + (-1)
            goto Lc
        L1c:
            int r6 = r6 + r3
            int r7 = org.fortheloss.sticknodes.App.getMaxNodesPerFrame()
            if (r6 <= r7) goto L24
            return r2
        L24:
            return r1
    }

    @Override // org.fortheloss.sticknodes.animationscreen.FramesContainer
    public boolean canAddFrame(org.fortheloss.sticknodes.data.IFrameData r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // org.fortheloss.sticknodes.animationscreen.FramesContainer
    public boolean canAddFrames(org.fortheloss.sticknodes.data.IFrameData r1, int r2) {
            r0 = this;
            r1 = 1
            return r1
    }

    public boolean deleteSound(int r8, org.fortheloss.sticknodes.movieclip.MCMovieclipSource r9) {
            r7 = this;
            if (r8 < 0) goto La1
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r0 = r7.librarySoundDatas
            int r0 = r0.size()
            if (r8 < r0) goto Lc
            goto La1
        Lc:
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r0 = r7.librarySoundDatas
            java.lang.Object r0 = r0.remove(r8)
            org.fortheloss.sticknodes.data.SoundData r0 = (org.fortheloss.sticknodes.data.SoundData) r0
            r0.dispose()
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r7.frames
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L1f:
            r2 = -1
            if (r0 < 0) goto L3e
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r3 = r7.frames
            java.lang.Object r3 = r3.get(r0)
            org.fortheloss.sticknodes.data.IFrameData r3 = (org.fortheloss.sticknodes.data.IFrameData) r3
            int r4 = r3.getSoundToPlayLibraryID()
            if (r4 != r8) goto L34
            r3.setSoundToPlay(r2)
            goto L3b
        L34:
            if (r4 <= r8) goto L3b
            int r4 = r4 + (-1)
            r3.setSoundToPlay(r4)
        L3b:
            int r0 = r0 + (-1)
            goto L1f
        L3e:
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r0 = r7.libraryMovieclips
            int r0 = r0.size()
            int r0 = r0 - r1
        L45:
            if (r0 < 0) goto L75
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r3 = r7.libraryMovieclips
            java.lang.Object r3 = r3.get(r0)
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r3 = (org.fortheloss.sticknodes.movieclip.MCMovieclipSource) r3
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r3 = r3.frames
            int r4 = r3.size()
            int r4 = r4 - r1
        L56:
            if (r4 < 0) goto L72
            java.lang.Object r5 = r3.get(r4)
            org.fortheloss.sticknodes.data.IFrameData r5 = (org.fortheloss.sticknodes.data.IFrameData) r5
            int r6 = r5.getSoundToPlayLibraryID()
            if (r6 != r8) goto L68
            r5.setSoundToPlay(r2)
            goto L6f
        L68:
            if (r6 <= r8) goto L6f
            int r6 = r6 + (-1)
            r5.setSoundToPlay(r6)
        L6f:
            int r4 = r4 + (-1)
            goto L56
        L72:
            int r0 = r0 + (-1)
            goto L45
        L75:
            if (r9 == 0) goto La0
            int r0 = r9.getLibraryID()
            if (r0 >= 0) goto La0
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r9 = r9.frames
            int r0 = r9.size()
            int r0 = r0 - r1
        L84:
            if (r0 < 0) goto La0
            java.lang.Object r3 = r9.get(r0)
            org.fortheloss.sticknodes.data.IFrameData r3 = (org.fortheloss.sticknodes.data.IFrameData) r3
            int r4 = r3.getSoundToPlayLibraryID()
            if (r4 != r8) goto L96
            r3.setSoundToPlay(r2)
            goto L9d
        L96:
            if (r4 <= r8) goto L9d
            int r4 = r4 + (-1)
            r3.setSoundToPlay(r4)
        L9d:
            int r0 = r0 + (-1)
            goto L84
        La0:
            return r1
        La1:
            r8 = 0
            return r8
    }

    public void dispose() {
            r5 = this;
            r0 = 0
            r5._sessionSaveData = r0
            r5._savedCacheLibraryIDs = r0
            r5._savingLoadingStatusString = r0
            r5.projectName = r0
            r5.watermarkText = r0
            r5.watermarkColor = r0
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r5.frames
            if (r1 == 0) goto L29
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L17:
            if (r1 < 0) goto L27
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r2 = r5.frames
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.data.IFrameData r2 = (org.fortheloss.sticknodes.data.IFrameData) r2
            r2.dispose()
            int r1 = r1 + (-1)
            goto L17
        L27:
            r5.frames = r0
        L29:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r1 = r5.libraryStickfigures
            if (r1 == 0) goto L45
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L33:
            if (r1 < 0) goto L43
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r2 = r5.libraryStickfigures
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r2
            r2.dispose()
            int r1 = r1 + (-1)
            goto L33
        L43:
            r5.libraryStickfigures = r0
        L45:
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r1 = r5.libraryMovieclips
            if (r1 == 0) goto L61
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L4f:
            if (r1 < 0) goto L5f
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r2 = r5.libraryMovieclips
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r2 = (org.fortheloss.sticknodes.movieclip.MCMovieclipSource) r2
            r2.dispose()
            int r1 = r1 + (-1)
            goto L4f
        L5f:
            r5.libraryMovieclips = r0
        L61:
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r1 = r5.librarySprites
            r2 = 100
            if (r1 == 0) goto L9b
            boolean r1 = org.fortheloss.sticknodes.App.isMainThread()
            if (r1 == 0) goto L88
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r1 = r5.librarySprites
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L75:
            if (r1 < 0) goto L85
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r4 = r5.librarySprites
            java.lang.Object r4 = r4.get(r1)
            org.fortheloss.sticknodes.sprite.ISpriteSource r4 = (org.fortheloss.sticknodes.sprite.ISpriteSource) r4
            r4.dispose()
            int r1 = r1 + (-1)
            goto L75
        L85:
            r5.librarySprites = r0
            goto L9b
        L88:
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            org.fortheloss.sticknodes.data.ProjectData$1 r4 = new org.fortheloss.sticknodes.data.ProjectData$1
            r4.<init>(r5)
            r1.postRunnable(r4)
        L92:
            java.lang.Thread.sleep(r2)     // Catch: java.lang.InterruptedException -> L96
            goto L97
        L96:
        L97:
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r1 = r5.librarySprites
            if (r1 != 0) goto L92
        L9b:
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r1 = r5.librarySoundDatas
            if (r1 == 0) goto Lb7
            int r1 = r1.size()
            int r1 = r1 + (-1)
        La5:
            if (r1 < 0) goto Lb5
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r4 = r5.librarySoundDatas
            java.lang.Object r4 = r4.get(r1)
            org.fortheloss.sticknodes.data.SoundData r4 = (org.fortheloss.sticknodes.data.SoundData) r4
            r4.dispose()
            int r1 = r1 + (-1)
            goto La5
        Lb5:
            r5.librarySoundDatas = r0
        Lb7:
            r5.hiddenStickfigureLibraryIDs = r0
            r5.hiddenMovieclipLibraryIDs = r0
            r5.hiddenSpriteLibraryIDs = r0
            r5.soundsNotFound = r0
            r5._idConversionMaps = r0
            org.fortheloss.sticknodes.animationscreen.FontLoader r1 = r5.mFontLoader
            if (r1 == 0) goto Le6
            boolean r1 = org.fortheloss.sticknodes.App.isMainThread()
            if (r1 == 0) goto Ld3
            org.fortheloss.sticknodes.animationscreen.FontLoader r1 = r5.mFontLoader
            r1.dispose()
            r5.mFontLoader = r0
            goto Le6
        Ld3:
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            org.fortheloss.sticknodes.data.ProjectData$2 r1 = new org.fortheloss.sticknodes.data.ProjectData$2
            r1.<init>(r5)
            r0.postRunnable(r1)
        Ldd:
            java.lang.Thread.sleep(r2)     // Catch: java.lang.InterruptedException -> Le1
            goto Le2
        Le1:
        Le2:
            org.fortheloss.sticknodes.animationscreen.FontLoader r0 = r5.mFontLoader
            if (r0 != 0) goto Ldd
        Le6:
            return
    }

    public org.fortheloss.sticknodes.animationscreen.FontLoader getFontLoader() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.FontLoader r0 = r1.mFontLoader
            return r0
    }

    public java.util.HashMap<java.lang.Integer, java.lang.Integer> getIDConversionMapForContainerUID(int r3, int r4) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.Integer, java.lang.Integer>>> r0 = r2._idConversionMaps
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.get(r1)
            java.util.HashMap r0 = (java.util.HashMap) r0
            if (r0 != 0) goto L1c
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.Integer, java.lang.Integer>>> r1 = r2._idConversionMaps
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.put(r3, r0)
        L1c:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            java.lang.Object r3 = r0.get(r3)
            java.util.HashMap r3 = (java.util.HashMap) r3
            if (r3 != 0) goto L34
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r4, r3)
        L34:
            return r3
    }

    public org.fortheloss.sticknodes.stickfigure.Stickfigure getLastAddedLibraryStickfigure() {
            r2 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r0 = r2.libraryStickfigures
            int r0 = r0.size()
            if (r0 > 0) goto La
            r0 = 0
            return r0
        La:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r0 = r2.libraryStickfigures
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r0
            return r0
    }

    public org.fortheloss.sticknodes.movieclip.MCMovieclipSource getLibraryMovieclip(int r2) {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r0 = r1.libraryMovieclips
            java.lang.Object r2 = r0.get(r2)
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r2 = (org.fortheloss.sticknodes.movieclip.MCMovieclipSource) r2
            return r2
    }

    public org.fortheloss.sticknodes.sprite.ISpriteSource getLibrarySprite(int r2) {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r0 = r1.librarySprites
            java.lang.Object r2 = r0.get(r2)
            org.fortheloss.sticknodes.sprite.ISpriteSource r2 = (org.fortheloss.sticknodes.sprite.ISpriteSource) r2
            return r2
    }

    public org.fortheloss.sticknodes.stickfigure.Stickfigure getLibraryStickfigure(int r2) {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r0 = r1.libraryStickfigures
            java.lang.Object r2 = r0.get(r2)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r2
            return r2
    }

    public int[][] getSavedCacheLibraryIDs() {
            r1 = this;
            int[][] r0 = r1._savedCacheLibraryIDs
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

    public org.fortheloss.sticknodes.data.SessionSaveData getSessionSaveData() {
            r1 = this;
            org.fortheloss.sticknodes.data.SessionSaveData r0 = r1._sessionSaveData
            return r0
    }

    public org.fortheloss.sticknodes.stickfigure.Stickfigure getStickfigureFromFile(com.badlogic.gdx.files.FileHandle r4) {
            r3 = this;
            r0 = 0
            java.io.InputStream r4 = r4.read()     // Catch: java.lang.Exception -> L36
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch: java.lang.Exception -> L36
            r1.<init>(r4)     // Catch: java.lang.Exception -> L36
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            r4.<init>()
            r4.readData(r1)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            r1.close()     // Catch: java.io.IOException -> L16
            goto L1a
        L16:
            r0 = move-exception
            r0.printStackTrace()
        L1a:
            return r4
        L1b:
            r4 = move-exception
            goto L2d
        L1d:
            r2 = move-exception
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L1b
            r4.dispose()     // Catch: java.lang.Throwable -> L1b
            r1.close()     // Catch: java.io.IOException -> L28
            goto L2c
        L28:
            r4 = move-exception
            r4.printStackTrace()
        L2c:
            return r0
        L2d:
            r1.close()     // Catch: java.io.IOException -> L31
            goto L35
        L31:
            r0 = move-exception
            r0.printStackTrace()
        L35:
            throw r4
        L36:
            r4 = move-exception
            r4.printStackTrace()
            return r0
    }

    public org.fortheloss.sticknodes.stickfigure.Stickfigure getStickfigureFromFileOld(com.badlogic.gdx.files.FileHandle r3) {
            r2 = this;
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            r0.<init>()
            byte[] r3 = r3.readBytes()     // Catch: java.lang.Exception -> L1a
            byte[] r3 = org.fortheloss.sticknodes.App.inflate(r3)     // Catch: java.lang.Exception -> L1a
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3)     // Catch: java.lang.Exception -> L1a
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Exception -> L1a
            r3.order(r1)     // Catch: java.lang.Exception -> L1a
            r0.readDataOld(r3)     // Catch: java.lang.Exception -> L1a
            return r0
        L1a:
            r3 = move-exception
            r3.printStackTrace()
            r0.dispose()
            r3 = 0
            return r3
    }

    public org.fortheloss.sticknodes.stickfigure.Stickfigure getStickfigureFromPivotFile(com.badlogic.gdx.files.FileHandle r19) {
            r18 = this;
            r1 = 0
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L10e
            java.io.File r2 = r19.file()     // Catch: java.io.FileNotFoundException -> L10e
            r0.<init>(r2)     // Catch: java.io.FileNotFoundException -> L10e
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.io.FileNotFoundException -> L10e
            r3 = 4096(0x1000, float:5.74E-42)
            r2.<init>(r0, r3)     // Catch: java.io.FileNotFoundException -> L10e
            org.fortheloss.framework.LittleEndianDataInputStream r3 = new org.fortheloss.framework.LittleEndianDataInputStream     // Catch: java.io.FileNotFoundException -> L10e
            r3.<init>(r2)     // Catch: java.io.FileNotFoundException -> L10e
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = r2.getMainNode()
            r0.put(r5, r6)
            int r5 = r3.read()     // Catch: java.lang.Throwable -> Lee java.io.IOException -> Lf1
            int r6 = r3.read()     // Catch: java.lang.Throwable -> Lee java.io.IOException -> Lf1
            r7 = 1
            if (r5 != r7) goto Ldf
            if (r6 <= 0) goto Ldf
            r5 = 400(0x190, float:5.6E-43)
            if (r6 <= r5) goto L4a
            r2.dispose()     // Catch: java.lang.Throwable -> Lee java.io.IOException -> Lf1
            r3.close()     // Catch: java.io.IOException -> L44
            goto L49
        L44:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()
        L49:
            return r1
        L4a:
            r5 = 0
        L4b:
            if (r5 >= r6) goto Ld5
            int r8 = r3.read()     // Catch: java.lang.Throwable -> Lee java.io.IOException -> Lf1
            int r9 = r3.read()     // Catch: java.lang.Throwable -> Lee java.io.IOException -> Lf1
            r3.readShort()     // Catch: java.lang.Throwable -> Lee java.io.IOException -> Lf1
            float r10 = r3.readFloat()     // Catch: java.lang.Throwable -> Lee java.io.IOException -> Lf1
            double r11 = r3.readDouble()     // Catch: java.lang.Throwable -> Lee java.io.IOException -> Lf1
            float r13 = r3.readFloat()     // Catch: java.lang.Throwable -> Lee java.io.IOException -> Lf1
            int r14 = r3.read()     // Catch: java.lang.Throwable -> Lee java.io.IOException -> Lf1
            if (r14 == 0) goto L6c
            r14 = 1
            goto L6d
        L6c:
            r14 = 0
        L6d:
            int r15 = r3.read()     // Catch: java.lang.Throwable -> Lee java.io.IOException -> Lf1
            if (r15 == 0) goto L75
            r15 = 1
            goto L76
        L75:
            r15 = 0
        L76:
            r3.readShort()     // Catch: java.lang.Throwable -> Lee java.io.IOException -> Lf1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lee java.io.IOException -> Lf1
            java.lang.Object r8 = r0.get(r8)     // Catch: java.lang.Throwable -> Lee java.io.IOException -> Lf1
            org.fortheloss.sticknodes.stickfigure.StickNode r8 = (org.fortheloss.sticknodes.stickfigure.StickNode) r8     // Catch: java.lang.Throwable -> Lee java.io.IOException -> Lf1
            r8.flagPositionAsDirty()     // Catch: java.lang.Throwable -> Lee java.io.IOException -> Lf1
            r16 = 1077936128(0x40400000, float:3.0)
            float r10 = r10 * r16
            r16 = 4633260480968785920(0x404ca5dc00000000, double:57.2957763671875)
            double r11 = -r11
            double r11 = r11 * r16
            float r1 = r8.getAngle()     // Catch: java.lang.Throwable -> Lee java.io.IOException -> Lf1
            r17 = r5
            double r4 = (double) r1     // Catch: java.lang.Throwable -> Lee java.io.IOException -> Lf1
            double r11 = r11 - r4
            float r1 = (float) r11     // Catch: java.lang.Throwable -> Lee java.io.IOException -> Lf1
            int r4 = java.lang.Math.round(r13)     // Catch: java.lang.Throwable -> Lee java.io.IOException -> Lf1
            int r4 = r4 * 3
            float r4 = (float) r4     // Catch: java.lang.Throwable -> Lee java.io.IOException -> Lf1
            if (r14 == 0) goto La6
            r5 = 2
            goto La7
        La6:
            r5 = 0
        La7:
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r8.addChildNode(r10, r1, r4, r5)     // Catch: java.lang.Throwable -> Lee java.io.IOException -> Lf1
            if (r14 == 0) goto Lbf
            r1.useSegmentColor(r7)     // Catch: java.lang.Throwable -> Lee java.io.IOException -> Lf1
            com.badlogic.gdx.graphics.Color r4 = com.badlogic.gdx.graphics.Color.WHITE     // Catch: java.lang.Throwable -> Lee java.io.IOException -> Lf1
            r1.setColor(r4)     // Catch: java.lang.Throwable -> Lee java.io.IOException -> Lf1
            r1.setUseCircleOutline(r7)     // Catch: java.lang.Throwable -> Lee java.io.IOException -> Lf1
            r4 = 1040187392(0x3e000000, float:0.125)
            r1.setCircleOutlineColor(r4, r4, r4)     // Catch: java.lang.Throwable -> Lee java.io.IOException -> Lf1
            r4 = 0
            goto Lc6
        Lbf:
            r4 = 0
            r1.useSegmentColor(r4)     // Catch: java.lang.Throwable -> Lee java.io.IOException -> Lf1
            r1.setUseCircleOutline(r4)     // Catch: java.lang.Throwable -> Lee java.io.IOException -> Lf1
        Lc6:
            r1.setStatic(r15)     // Catch: java.lang.Throwable -> Lee java.io.IOException -> Lf1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> Lee java.io.IOException -> Lf1
            r0.put(r5, r1)     // Catch: java.lang.Throwable -> Lee java.io.IOException -> Lf1
            int r5 = r17 + 1
            r1 = 0
            goto L4b
        Ld5:
            r3.close()     // Catch: java.io.IOException -> Ld9
            goto Lde
        Ld9:
            r0 = move-exception
            r1 = r0
            r1.printStackTrace()
        Lde:
            return r2
        Ldf:
            r2.dispose()     // Catch: java.lang.Throwable -> Lee java.io.IOException -> Lf1
            r3.close()     // Catch: java.io.IOException -> Le7
        Le5:
            r1 = 0
            goto Led
        Le7:
            r0 = move-exception
            r1 = r0
            r1.printStackTrace()
            goto Le5
        Led:
            return r1
        Lee:
            r0 = move-exception
            r1 = r0
            goto L104
        Lf1:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> Lee
            r2.dispose()     // Catch: java.lang.Throwable -> Lee
            r3.close()     // Catch: java.io.IOException -> Lfd
        Lfb:
            r1 = 0
            goto L103
        Lfd:
            r0 = move-exception
            r1 = r0
            r1.printStackTrace()
            goto Lfb
        L103:
            return r1
        L104:
            r3.close()     // Catch: java.io.IOException -> L108
            goto L10d
        L108:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()
        L10d:
            throw r1
        L10e:
            r0 = move-exception
            r0.printStackTrace()
            r1 = 0
            return r1
    }

    public void hideMovieclipInImportList(int r2, boolean r3) {
            r1 = this;
            if (r3 == 0) goto L19
            java.util.ArrayList<java.lang.Integer> r3 = r1.hiddenMovieclipLibraryIDs
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto Lf
            return
        Lf:
            java.util.ArrayList<java.lang.Integer> r3 = r1.hiddenMovieclipLibraryIDs
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L22
        L19:
            java.util.ArrayList<java.lang.Integer> r3 = r1.hiddenMovieclipLibraryIDs
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.remove(r2)
        L22:
            return
    }

    public void hideSpriteInImportList(int r2, boolean r3) {
            r1 = this;
            if (r3 == 0) goto L19
            java.util.ArrayList<java.lang.Integer> r3 = r1.hiddenSpriteLibraryIDs
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto Lf
            return
        Lf:
            java.util.ArrayList<java.lang.Integer> r3 = r1.hiddenSpriteLibraryIDs
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L22
        L19:
            java.util.ArrayList<java.lang.Integer> r3 = r1.hiddenSpriteLibraryIDs
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.remove(r2)
        L22:
            return
    }

    public void hideStickfigureInImportList(int r2, boolean r3) {
            r1 = this;
            if (r3 == 0) goto L19
            java.util.ArrayList<java.lang.Integer> r3 = r1.hiddenStickfigureLibraryIDs
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto Lf
            return
        Lf:
            java.util.ArrayList<java.lang.Integer> r3 = r1.hiddenStickfigureLibraryIDs
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L22
        L19:
            java.util.ArrayList<java.lang.Integer> r3 = r1.hiddenStickfigureLibraryIDs
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.remove(r2)
        L22:
            return
    }

    public boolean importPivotStickfigure(com.badlogic.gdx.files.FileHandle r10) {
            r9 = this;
            boolean r0 = r10.exists()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r9.getStickfigureFromPivotFile(r10)
            r2 = 1
            if (r0 != 0) goto L11
            r3 = 0
            goto L12
        L11:
            r3 = 1
        L12:
            if (r3 == 0) goto L64
            java.lang.String r10 = r10.nameWithoutExtension()
            r5 = r10
            r4 = 1
            r6 = 0
        L1b:
            if (r4 == 0) goto L5d
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r7 = r9.libraryStickfigures
            int r7 = r7.size()
            int r7 = r7 - r2
        L24:
            if (r7 < 0) goto L58
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r8 = r9.libraryStickfigures
            java.lang.Object r8 = r8.get(r7)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r8 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r8
            java.lang.String r8 = r8.getName()
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L55
            int r6 = r6 + 1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r10)
            java.lang.String r7 = " ("
            r5.append(r7)
            r5.append(r6)
            java.lang.String r7 = ")"
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            r7 = 1
            goto L59
        L55:
            int r7 = r7 + (-1)
            goto L24
        L58:
            r7 = 0
        L59:
            if (r7 != 0) goto L1b
            r4 = 0
            goto L1b
        L5d:
            r0.setName(r5)
            r9.addStickfigureToLibrary(r0)
            goto L69
        L64:
            if (r0 == 0) goto L69
            r0.dispose()
        L69:
            return r3
    }

    public int importSound(com.badlogic.gdx.files.FileHandle r7) {
            r6 = this;
            boolean r0 = r7.exists()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            long r2 = r7.length()
            r4 = 256000(0x3e800, double:1.26481E-318)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L15
            r7 = 3
            return r7
        L15:
            r0 = 0
            r2 = 1
            com.badlogic.gdx.Audio r3 = com.badlogic.gdx.Gdx.audio     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L1f
            com.badlogic.gdx.audio.Sound r0 = r3.newSound(r7)     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L1f
            r3 = 1
            goto L24
        L1f:
            r3 = move-exception
            r3.printStackTrace()
            r3 = 0
        L24:
            if (r0 != 0) goto L27
            r3 = 0
        L27:
            if (r3 == 0) goto L5f
            java.lang.String r7 = r7.name()
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r3 = r6.librarySoundDatas
            int r3 = r3.size()
            int r3 = r3 - r2
        L34:
            if (r3 < 0) goto L4a
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r4 = r6.librarySoundDatas
            java.lang.Object r4 = r4.get(r3)
            org.fortheloss.sticknodes.data.SoundData r4 = (org.fortheloss.sticknodes.data.SoundData) r4
            java.lang.String r4 = r4.fileName
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L47
            goto L4b
        L47:
            int r3 = r3 + (-1)
            goto L34
        L4a:
            r1 = 1
        L4b:
            if (r1 == 0) goto L58
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r1 = r6.librarySoundDatas
            org.fortheloss.sticknodes.data.SoundData r3 = new org.fortheloss.sticknodes.data.SoundData
            r3.<init>(r0, r7)
            r1.add(r3)
            return r2
        L58:
            if (r0 == 0) goto L5d
            r0.dispose()
        L5d:
            r7 = 2
            return r7
        L5f:
            if (r0 == 0) goto L64
            r0.dispose()
        L64:
            return r1
    }

    public boolean importStickfigure(com.badlogic.gdx.files.FileHandle r9, java.lang.String r10) {
            r8 = this;
            boolean r0 = r9.exists()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r8.getStickfigureFromFile(r9)
            r2 = 1
            if (r0 != 0) goto L11
            r3 = 0
            goto L12
        L11:
            r3 = 1
        L12:
            if (r3 == 0) goto L66
            if (r10 != 0) goto L1a
            java.lang.String r10 = r9.nameWithoutExtension()
        L1a:
            r4 = r10
            r9 = 1
            r5 = 0
        L1d:
            if (r9 == 0) goto L5f
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r6 = r8.libraryStickfigures
            int r6 = r6.size()
            int r6 = r6 - r2
        L26:
            if (r6 < 0) goto L5a
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r7 = r8.libraryStickfigures
            java.lang.Object r7 = r7.get(r6)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r7 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r7
            java.lang.String r7 = r7.getName()
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L57
            int r5 = r5 + 1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r10)
            java.lang.String r6 = " ("
            r4.append(r6)
            r4.append(r5)
            java.lang.String r6 = ")"
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r6 = 1
            goto L5b
        L57:
            int r6 = r6 + (-1)
            goto L26
        L5a:
            r6 = 0
        L5b:
            if (r6 != 0) goto L1d
            r9 = 0
            goto L1d
        L5f:
            r0.setName(r4)
            r8.addStickfigureToLibrary(r0)
            goto L6b
        L66:
            if (r0 == 0) goto L6b
            r0.dispose()
        L6b:
            return r3
    }

    public boolean importStickfigureOld(com.badlogic.gdx.files.FileHandle r10) {
            r9 = this;
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r9.getStickfigureFromFileOld(r10)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto La
            r3 = 0
            goto Lb
        La:
            r3 = 1
        Lb:
            if (r3 == 0) goto L5d
            java.lang.String r10 = r10.nameWithoutExtension()
            r5 = r10
            r4 = 1
            r6 = 0
        L14:
            if (r4 == 0) goto L56
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r7 = r9.libraryStickfigures
            int r7 = r7.size()
            int r7 = r7 - r2
        L1d:
            if (r7 < 0) goto L51
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r8 = r9.libraryStickfigures
            java.lang.Object r8 = r8.get(r7)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r8 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r8
            java.lang.String r8 = r8.getName()
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L4e
            int r6 = r6 + 1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r10)
            java.lang.String r7 = " ("
            r5.append(r7)
            r5.append(r6)
            java.lang.String r7 = ")"
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            r7 = 1
            goto L52
        L4e:
            int r7 = r7 + (-1)
            goto L1d
        L51:
            r7 = 0
        L52:
            if (r7 != 0) goto L14
            r4 = 0
            goto L14
        L56:
            r0.setName(r5)
            r9.addStickfigureToLibrary(r0)
            goto L62
        L5d:
            if (r0 == 0) goto L62
            r0.dispose()
        L62:
            return r3
    }

    public void newProject() {
            r3 = this;
            java.lang.String r0 = ""
            r3.projectName = r0
            r0 = 0
            r3.isYoutubeShorts = r0
            r3.watermarkEnabled = r0
            java.lang.String r1 = ":)"
            r3.watermarkText = r1
            com.badlogic.gdx.graphics.Color r1 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r2 = org.fortheloss.sticknodes.App.COLOR_RED
            r1.<init>(r2)
            r3.watermarkColor = r1
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1156579328(0x44f00000, float:1920.0)
            float r2 = r2 * r1
            int r2 = (int) r2
            r3.canvasWidth = r2
            r2 = 1149698048(0x44870000, float:1080.0)
            float r1 = r1 * r2
            int r1 = (int) r1
            r3.canvasHeight = r1
            r3.hasShownPanningModeMessage = r0
            r3.hasShownTweeningMessage = r0
            r3.hasShownLoopMessage = r0
            r3.hasShownMagnifierMessage = r0
            r3.tweeningEnabled = r0
            r3.isLoop = r0
            r1 = 10
            r3.fps = r1
            r1 = 5
            r3.numTweenedFrames = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.frames = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.libraryStickfigures = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.libraryMovieclips = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.librarySprites = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.librarySoundDatas = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.soundsNotFound = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.hiddenStickfigureLibraryIDs = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.hiddenMovieclipLibraryIDs = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.hiddenSpriteLibraryIDs = r1
            r3._uniqueFigureID = r0
            org.fortheloss.sticknodes.data.ProjectData.uniqueTextfieldBoxID = r0
            org.fortheloss.sticknodes.data.ProjectData.uniqueMovieclipID = r0
            r1 = 1
            org.fortheloss.sticknodes.data.ProjectData.framesContainerUID = r1
            r3._uid = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3._idConversionMaps = r0
            org.fortheloss.sticknodes.data.FrameData r0 = new org.fortheloss.sticknodes.data.FrameData
            r0.<init>(r3)
            r0.setIsLastFrame(r1)
            r0.setIsFirstFrame(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r3.frames
            r1.add(r0)
            return
    }

    public boolean openProject(com.badlogic.gdx.files.FileHandle r39, float r40, boolean r41) {
            r38 = this;
            r7 = r38
            java.lang.String r1 = "statusOpening1"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r8 = "..."
            r2.append(r8)
            java.lang.String r1 = r2.toString()
            r9 = 0
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r7.setSavingOpeningStatusText(r1, r2)
            boolean r1 = r39.exists()
            if (r1 != 0) goto L26
            return r9
        L26:
            boolean r1 = org.fortheloss.sticknodes.App.checkIfContainsNonsenseData(r39)
            r11 = 1
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L4a
            java.io.File r3 = r39.file()     // Catch: java.lang.Exception -> L4a
            r2.<init>(r3)     // Catch: java.lang.Exception -> L4a
            if (r1 == 0) goto L3b
            r3 = 9
            r2.skip(r3)     // Catch: java.lang.Exception -> L4a
        L3b:
            java.util.zip.GZIPInputStream r1 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Exception -> L4a
            r3 = 4096(0x1000, float:5.74E-42)
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L4a
            java.io.DataInputStream r2 = new java.io.DataInputStream     // Catch: java.lang.Exception -> L4a
            r2.<init>(r1)     // Catch: java.lang.Exception -> L4a
            r12 = r2
            r13 = 1
            goto L51
        L4a:
            r0 = move-exception
            r1 = r0
            r1.printStackTrace()
            r12 = 0
            r13 = 0
        L51:
            if (r13 == 0) goto Lb03
            java.lang.String r1 = "statusOpening2"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2.<init>()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2.append(r1)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2.append(r8)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.Object[] r2 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7.setSavingOpeningStatusText(r1, r2)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r1 = org.fortheloss.sticknodes.App.assetScaling     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2 = 1156579328(0x44f00000, float:1920.0)
            float r3 = r1 * r2
            int r3 = (int) r3     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7.canvasWidth = r3     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r3 = 1149698048(0x44870000, float:1080.0)
            float r1 = r1 * r3
            int r1 = (int) r1     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7.canvasHeight = r1     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r15 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r1 = 401(0x191, float:5.62E-43)
            if (r15 < r1) goto L8b
            int r1 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r6 = r1
            goto L8c
        L8b:
            r6 = 1
        L8c:
            java.io.PrintStream r1 = java.lang.System.out     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4.<init>()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r5 = "Opening project made with version "
            r4.append(r5)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4.append(r15)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r5 = ", build "
            r4.append(r5)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4.append(r6)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r1.println(r4)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r4 = "opening_project_version"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r5.<init>()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r5.append(r15)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r1.setCrashlyticsKeyString(r4, r5)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r4 = "opening_project_build"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r5.<init>()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r5.append(r6)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r1.setCrashlyticsKeyString(r4, r5)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r1 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            byte[] r4 = new byte[r1]     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r12.readFully(r4, r9, r1)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r1.<init>(r4)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7.projectName = r1     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r1 = r39.nameWithoutExtension()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7.projectName = r1     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r5 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r40 > r5 ? 1 : (r40 == r5 ? 0 : -1))
            if (r1 >= 0) goto L12f
            r1 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r40
            int r1 = java.lang.Math.round(r1)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r4 = "_"
            if (r41 == 0) goto L114
            java.lang.String r10 = r7.projectName     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r14.<init>()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r14.append(r10)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r14.append(r4)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r14.append(r1)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r1 = "_percent_from_first_frame"
            r14.append(r1)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r1 = r14.toString()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7.projectName = r1     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            goto L12f
        L114:
            java.lang.String r10 = r7.projectName     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r14.<init>()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r14.append(r10)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r14.append(r4)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r14.append(r1)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r1 = "_percent_from_last_frame"
            r14.append(r1)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r1 = r14.toString()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7.projectName = r1     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
        L12f:
            r1 = 16
            if (r6 < r1) goto L13b
            int r4 = r12.read()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r4 == 0) goto L13b
            r4 = 1
            goto L13c
        L13b:
            r4 = 0
        L13c:
            r7.isYoutubeShorts = r4     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7.watermarkEnabled = r9     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r4 = ":)"
            r7.watermarkText = r4     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            com.badlogic.gdx.graphics.Color r4 = new com.badlogic.gdx.graphics.Color     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            com.badlogic.gdx.graphics.Color r10 = org.fortheloss.sticknodes.App.COLOR_RED     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4.<init>(r10)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7.watermarkColor = r4     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4 = 220(0xdc, float:3.08E-43)
            if (r15 < r4) goto L18f
            r10 = 244(0xf4, float:3.42E-43)
            if (r15 < r10) goto L160
            int r10 = r12.read()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r10 == 0) goto L15d
            r10 = 1
            goto L15e
        L15d:
            r10 = 0
        L15e:
            r7.watermarkEnabled = r10     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
        L160:
            int r10 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r10 <= 0) goto L172
            byte[] r14 = new byte[r10]     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r12.readFully(r14, r9, r10)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r10 = new java.lang.String     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r10.<init>(r14)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7.watermarkText = r10     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
        L172:
            int r10 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            com.badlogic.gdx.graphics.Color r14 = r7.watermarkColor     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2 = r10 & 255(0xff, float:3.57E-43)
            float r2 = (float) r2     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r18 = 1132396544(0x437f0000, float:255.0)
            float r2 = r2 / r18
            int r3 = r10 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            float r3 = (float) r3     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r3 = r3 / r18
            int r10 = r10 >> r1
            r10 = r10 & 255(0xff, float:3.57E-43)
            float r10 = (float) r10     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r10 = r10 / r18
            r14.set(r2, r3, r10, r5)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
        L18f:
            int r2 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7.fps = r2     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2 = 176(0xb0, float:2.47E-43)
            if (r15 < r2) goto L19e
            int r3 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            goto L19f
        L19e:
            r3 = 2
        L19f:
            r7.numTweenedFrames = r3     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r3 = 127(0x7f, float:1.78E-43)
            if (r15 < r3) goto L1ad
            int r10 = r12.read()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r10 == 0) goto L1ad
            r10 = 1
            goto L1ae
        L1ad:
            r10 = 0
        L1ae:
            r7.hasShownLoopMessage = r10     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r10 = 113(0x71, float:1.58E-43)
            if (r15 < r10) goto L1bc
            int r10 = r12.read()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r10 == 0) goto L1bc
            r10 = 1
            goto L1bd
        L1bc:
            r10 = 0
        L1bd:
            r7.hasShownPanningModeMessage = r10     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r10 = r12.read()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r10 == 0) goto L1c7
            r10 = 1
            goto L1c8
        L1c7:
            r10 = 0
        L1c8:
            r7.hasShownTweeningMessage = r10     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r15 < r4) goto L1d4
            int r4 = r12.read()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r4 == 0) goto L1d4
            r4 = 1
            goto L1d5
        L1d4:
            r4 = 0
        L1d5:
            r7.hasShownMagnifierMessage = r4     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r4 = r12.read()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r4 == 0) goto L1df
            r4 = 1
            goto L1e0
        L1df:
            r4 = 0
        L1e0:
            r7.tweeningEnabled = r4     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r15 < r3) goto L1ec
            int r3 = r12.read()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r3 == 0) goto L1ec
            r3 = 1
            goto L1ed
        L1ec:
            r3 = 0
        L1ed:
            r7.isLoop = r3     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r3 = 140(0x8c, float:1.96E-43)
            if (r15 < r3) goto L1fa
            r3 = 200(0xc8, float:2.8E-43)
            if (r15 >= r3) goto L1fa
            r12.read()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
        L1fa:
            int r3 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7._uniqueFigureID = r3     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r15 < r2) goto L207
            int r2 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            goto L208
        L207:
            r2 = 0
        L208:
            org.fortheloss.sticknodes.data.ProjectData.uniqueTextfieldBoxID = r2     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2 = 300(0x12c, float:4.2E-43)
            if (r15 < r2) goto L213
            int r3 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            goto L214
        L213:
            r3 = 0
        L214:
            org.fortheloss.sticknodes.data.ProjectData.uniqueMovieclipID = r3     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r15 < r2) goto L21d
            int r3 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            goto L21e
        L21d:
            r3 = 1
        L21e:
            org.fortheloss.sticknodes.data.ProjectData.framesContainerUID = r3     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7._uid = r9     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r20 = 50
            r10 = 400(0x190, float:5.6E-43)
            if (r15 < r10) goto L283
            java.lang.String r3 = "statusOpening9"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4.<init>()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4.append(r3)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4.append(r8)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7.setSavingOpeningStatusText(r3, r4)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r3 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r14 = 10
            r4.<init>(r14)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r14 = 0
        L24e:
            if (r14 >= r3) goto L262
            int r18 = r12.read()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r18 == 0) goto L25d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4.add(r5)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
        L25d:
            int r14 = r14 + 1
            r5 = 1065353216(0x3f800000, float:1.0)
            goto L24e
        L262:
            java.lang.Thread.sleep(r20)     // Catch: java.lang.InterruptedException -> L266 java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            goto L26b
        L266:
            r0 = move-exception
            r3 = r0
            r3.printStackTrace()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
        L26b:
            boolean[] r3 = new boolean[r11]     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r3[r9] = r9     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            org.fortheloss.sticknodes.data.ProjectData$3 r5 = new org.fortheloss.sticknodes.data.ProjectData$3     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r5.<init>(r7, r4, r3)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            com.badlogic.gdx.Application r4 = com.badlogic.gdx.Gdx.app     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4.postRunnable(r5)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
        L279:
            boolean r4 = r3[r9]     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r4 != 0) goto L283
            r4 = 250(0xfa, double:1.235E-321)
            java.lang.Thread.sleep(r4)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            goto L279
        L283:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r3.<init>()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7.hiddenStickfigureLibraryIDs = r3     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r3.<init>()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7.hiddenMovieclipLibraryIDs = r3     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r3.<init>()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7.hiddenSpriteLibraryIDs = r3     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r15 < r2) goto L2de
            int r3 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
        L29e:
            if (r3 <= 0) goto L2b0
            int r3 = r3 + (-1)
            java.util.ArrayList<java.lang.Integer> r4 = r7.hiddenStickfigureLibraryIDs     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r5 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4.add(r5)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            goto L29e
        L2b0:
            int r3 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
        L2b4:
            if (r3 <= 0) goto L2c6
            int r3 = r3 + (-1)
            java.util.ArrayList<java.lang.Integer> r4 = r7.hiddenMovieclipLibraryIDs     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r5 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4.add(r5)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            goto L2b4
        L2c6:
            if (r15 < r10) goto L2de
            int r3 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
        L2cc:
            if (r3 <= 0) goto L2de
            int r3 = r3 + (-1)
            java.util.ArrayList<java.lang.Integer> r4 = r7.hiddenSpriteLibraryIDs     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r5 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4.add(r5)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            goto L2cc
        L2de:
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r3.<init>()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7._idConversionMaps = r3     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r15 < r2) goto L341
            int r3 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
        L2eb:
            if (r3 <= 0) goto L341
            int r4 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r5 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.util.HashMap r14 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r14.<init>()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.Integer, java.lang.Integer>>> r2 = r7._idConversionMaps     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2.put(r4, r14)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
        L303:
            if (r5 <= 0) goto L339
            int r2 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r4 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.util.HashMap r11 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r11.<init>()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r14.put(r2, r11)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
        L319:
            if (r4 <= 0) goto L333
            int r2 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r23 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r11.put(r2, r1)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r4 = r4 + (-1)
            r1 = 16
            goto L319
        L333:
            int r5 = r5 + (-1)
            r1 = 16
            r11 = 1
            goto L303
        L339:
            int r3 = r3 + (-1)
            r1 = 16
            r2 = 300(0x12c, float:4.2E-43)
            r11 = 1
            goto L2eb
        L341:
            if (r15 >= r10) goto L4a0
            r1 = 140(0x8c, float:1.96E-43)
            if (r15 < r1) goto L34f
            int r1 = r12.read()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r1 == 0) goto L34f
            r1 = 1
            goto L350
        L34f:
            r1 = 0
        L350:
            if (r1 == 0) goto L4a0
            java.lang.String r1 = "statusOpening3"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2.<init>()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2.append(r1)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2.append(r8)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.Object[] r2 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7.setSavingOpeningStatusText(r1, r2)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r1 = 170(0xaa, float:2.38E-43)
            if (r15 >= r1) goto L37e
            int r1 = r12.read()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r1 != 0) goto L378
            r1 = 1
            goto L379
        L378:
            r1 = 0
        L379:
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L389
        L37e:
            float r1 = r12.readFloat()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r2 = r12.readFloat()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r3 = r2
            r2 = r1
            r1 = 0
        L389:
            int r4 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r5 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r11 = r4 * r5
            int r11 = r11 * 3
            byte[] r14 = new byte[r11]     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r12.readFully(r14, r9, r11)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            com.badlogic.gdx.graphics.Pixmap r10 = new com.badlogic.gdx.graphics.Pixmap     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            com.badlogic.gdx.graphics.Pixmap$Format r9 = com.badlogic.gdx.graphics.Pixmap.Format.RGB888     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r10.<init>(r4, r5, r9)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r9 = 0
            r25 = 0
        L3a4:
            if (r9 >= r11) goto L3da
            r26 = r2
            r2 = r14[r9]     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            int r27 = r9 + 1
            r28 = r3
            r3 = r14[r27]     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r3 = r3 & 255(0xff, float:3.57E-43)
            r24 = 16
            int r3 = r3 << 16
            r2 = r2 | r3
            int r3 = r9 + 2
            r3 = r14[r3]     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 8
            r2 = r2 | r3
            r2 = r2 | 255(0xff, float:3.57E-43)
            int r3 = r25 % r4
            r27 = r11
            int r11 = r25 / r4
            r10.drawPixel(r3, r11, r2)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r9 = r9 + 3
            int r25 = r25 + 1
            r2 = r26
            r11 = r27
            r3 = r28
            goto L3a4
        L3da:
            r26 = r2
            r28 = r3
            if (r1 == 0) goto L419
            com.badlogic.gdx.utils.Scaling r1 = com.badlogic.gdx.utils.Scaling.fit     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r2 = (float) r4     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r3 = (float) r5     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r9 = r7.canvasWidth     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r9 = (float) r9     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r11 = r7.canvasHeight     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r11 = (float) r11     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            com.badlogic.gdx.math.Vector2 r1 = r1.apply(r2, r3, r9, r11)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r2 = r7.canvasWidth     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r2 = (float) r2     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r3 = r1.x     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r2 = r2 / r3
            int r3 = r7.canvasHeight     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r3 = (float) r3     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r1 = r1.y     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r3 = r3 / r1
            r1 = 1028443341(0x3d4ccccd, float:0.05)
            float r2 = r2 / r1
            double r1 = (double) r2     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            double r1 = java.lang.Math.ceil(r1)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r1 = (int) r1     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r1 = (float) r1     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2 = 1028443341(0x3d4ccccd, float:0.05)
            float r1 = r1 * r2
            float r3 = r3 / r2
            double r2 = (double) r3     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            double r2 = java.lang.Math.ceil(r2)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r2 = (int) r2     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r2 = (float) r2     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r3 = 1028443341(0x3d4ccccd, float:0.05)
            float r3 = r3 * r2
            r2 = r1
            goto L41d
        L419:
            r2 = r26
            r3 = r28
        L41d:
            com.badlogic.gdx.utils.Scaling r1 = com.badlogic.gdx.utils.Scaling.fit     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r9 = (float) r4     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r11 = (float) r5     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r17 = r2
            r19 = r3
            r2 = 1156579328(0x44f00000, float:1920.0)
            r14 = 1149698048(0x44870000, float:1080.0)
            com.badlogic.gdx.math.Vector2 r3 = r1.apply(r9, r11, r2, r14)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r2 = r3.x     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r35 = r15
            double r14 = (double) r2     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            double r14 = java.lang.Math.ceil(r14)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r2 = (float) r14     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r2 = r2 / r9
            float r3 = r3.y     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            double r14 = (double) r3     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            double r14 = java.lang.Math.ceil(r14)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r3 = (float) r14     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r3 = r3 / r11
            if (r4 < r5) goto L446
            r14 = 1156579328(0x44f00000, float:1920.0)
            goto L448
        L446:
            r14 = 1149698048(0x44870000, float:1080.0)
        L448:
            if (r4 < r5) goto L44d
            r15 = 1149698048(0x44870000, float:1080.0)
            goto L44f
        L44d:
            r15 = 1156579328(0x44f00000, float:1920.0)
        L44f:
            int r24 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r24 > 0) goto L462
            int r24 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r24 <= 0) goto L458
            goto L462
        L458:
            r36 = r6
            r14 = r10
            r24 = r13
        L45d:
            r9 = r17
            r10 = r19
            goto L4af
        L462:
            com.badlogic.gdx.math.Vector2 r1 = r1.apply(r9, r11, r14, r15)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            com.badlogic.gdx.graphics.Pixmap r14 = new com.badlogic.gdx.graphics.Pixmap     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r15 = r1.x     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r15 = (int) r15     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r24 = r13
            float r13 = r1.y     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r13 = (int) r13     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r36 = r6
            com.badlogic.gdx.graphics.Pixmap$Format r6 = com.badlogic.gdx.graphics.Pixmap.Format.RGB888     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r14.<init>(r15, r13, r6)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r27 = 0
            r28 = 0
            r31 = 0
            r32 = 0
            float r6 = r1.x     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r6 = (int) r6     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r13 = r1.y     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r13 = (int) r13     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r25 = r14
            r26 = r10
            r29 = r4
            r30 = r5
            r33 = r6
            r34 = r13
            r25.drawPixmap(r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r4 = r1.x     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r4 = r4 / r9
            float r2 = r2 / r4
            float r1 = r1.y     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r1 = r1 / r11
            float r3 = r3 / r1
            r10.dispose()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            goto L45d
        L4a0:
            r36 = r6
            r24 = r13
            r35 = r15
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1065353216(0x3f800000, float:1.0)
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
        L4af:
            int r1 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4.<init>()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7.libraryStickfigures = r4     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4 = 0
        L4bb:
            if (r4 >= r1) goto L508
            java.lang.String r5 = "statusOpening4"
            r6 = 2
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r4 = r4 + 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r13 = 0
            r11[r13] = r6     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r13 = 1
            r11[r13] = r6     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5, r11)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r6.<init>()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r6.append(r5)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r6.append(r8)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r6 = 0
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7.setSavingOpeningStatusText(r5, r11)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r5 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            byte[] r11 = new byte[r5]     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r12.readFully(r11, r6, r5)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r5.<init>(r11)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            org.fortheloss.sticknodes.stickfigure.Stickfigure r6 = new org.fortheloss.sticknodes.stickfigure.Stickfigure     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r6.<init>()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r6.readData(r12)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r6.setName(r5)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7.addStickfigureToLibrary(r6)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            goto L4bb
        L508:
            r1 = 248(0xf8, float:3.48E-43)
            r11 = r35
            if (r11 < r1) goto L52a
            r1 = 251(0xfb, float:3.52E-43)
            if (r11 > r1) goto L52a
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r1 = r7.libraryStickfigures     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4 = 1
            int r1 = r1 - r4
        L51a:
            if (r1 < 0) goto L52a
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r4 = r7.libraryStickfigures     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r4     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4.apply252SmartStretchFix()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r1 = r1 + (-1)
            goto L51a
        L52a:
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            boolean r1 = r1.isPro()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4.<init>()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7.librarySoundDatas = r4     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4.<init>()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7.soundsNotFound = r4     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r13.<init>()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4 = 160(0xa0, float:2.24E-43)
            if (r11 < r4) goto L5de
            int r4 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r5 = 0
        L54c:
            if (r5 >= r4) goto L5de
            java.lang.String r6 = "statusOpening5"
            r17 = r10
            r15 = 2
            java.lang.Object[] r10 = new java.lang.Object[r15]     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r15 = r5 + 1
            java.lang.Integer r19 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r25 = 0
            r10[r25] = r19     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.Integer r19 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r22 = 1
            r10[r22] = r19     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6, r10)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r10.<init>()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r10.append(r6)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r10.append(r8)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r6 = r10.toString()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r19 = r4
            r10 = 0
            java.lang.Object[] r4 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7.setSavingOpeningStatusText(r6, r4)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r4 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            byte[] r6 = new byte[r4]     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r12.readFully(r6, r10, r4)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4.<init>(r6)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r1 == 0) goto L5c7
            com.badlogic.gdx.Files r6 = com.badlogic.gdx.Gdx.files     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r10 = org.fortheloss.sticknodes.App.soundsPath     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r25 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r1.<init>()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r1.append(r10)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r1.append(r4)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            com.badlogic.gdx.files.FileHandle r1 = r6.absolute(r1)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            boolean r6 = r1.exists()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r6 == 0) goto L5b6
            int r1 = r7.importSound(r1)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            goto L5b7
        L5b6:
            r1 = 0
        L5b7:
            r6 = 1
            if (r1 == r6) goto L5d5
            java.util.ArrayList<java.lang.String> r1 = r7.soundsNotFound     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r1.add(r4)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r13.add(r1)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            goto L5d5
        L5c7:
            r25 = r1
            java.util.ArrayList<java.lang.String> r1 = r7.soundsNotFound     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r1.add(r4)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r13.add(r1)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
        L5d5:
            r5 = r15
            r10 = r17
            r4 = r19
            r1 = r25
            goto L54c
        L5de:
            r17 = r10
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r1.<init>()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7.librarySprites = r1     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r1 = 400(0x190, float:5.6E-43)
            if (r11 < r1) goto L672
            int r1 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2 = 0
        L5f0:
            if (r2 >= r1) goto L650
            java.lang.String r3 = "statusOpening4_3"
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r2 = r2 + 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r6 = 0
            r5[r6] = r4     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r6 = 1
            r5[r6] = r4     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3, r5)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4.<init>()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4.append(r3)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4.append(r8)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7.setSavingOpeningStatusText(r3, r5)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r3 = r12.read()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r3 == 0) goto L628
            r3 = 1
            goto L629
        L628:
            r3 = 0
        L629:
            int r4 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            byte[] r5 = new byte[r4]     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r6 = 0
            r12.readFully(r5, r6, r4)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r3 == 0) goto L640
            org.fortheloss.sticknodes.sprite.SpriteGroupSource r3 = new org.fortheloss.sticknodes.sprite.SpriteGroupSource     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            goto L645
        L640:
            org.fortheloss.sticknodes.sprite.SpriteSource r3 = new org.fortheloss.sticknodes.sprite.SpriteSource     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
        L645:
            r6 = r36
            r3.readLibraryData(r11, r6, r12)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7.addSpriteToLibrary(r3)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r36 = r6
            goto L5f0
        L650:
            r6 = r36
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r1 = r7.librarySprites     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2 = 1
            int r1 = r1 - r2
        L65a:
            if (r1 < 0) goto L685
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r2 = r7.librarySprites     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            org.fortheloss.sticknodes.sprite.ISpriteSource r2 = (org.fortheloss.sticknodes.sprite.ISpriteSource) r2     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            boolean r3 = r2 instanceof org.fortheloss.sticknodes.sprite.SpriteGroupSource     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r3 == 0) goto L66f
            org.fortheloss.sticknodes.sprite.SpriteGroupSource r2 = (org.fortheloss.sticknodes.sprite.SpriteGroupSource) r2     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r3 = r7.librarySprites     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2.rebuildStates(r3)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
        L66f:
            int r1 = r1 + (-1)
            goto L65a
        L672:
            r6 = r36
            if (r14 == 0) goto L685
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            org.fortheloss.sticknodes.data.ProjectData$4 r4 = new org.fortheloss.sticknodes.data.ProjectData$4     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4.<init>(r7, r14, r2, r3)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r1.postRunnable(r4)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r1 = 500(0x1f4, double:2.47E-321)
            java.lang.Thread.sleep(r1)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
        L685:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r1.<init>()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7.libraryMovieclips = r1     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r1 = 300(0x12c, float:4.2E-43)
            if (r11 < r1) goto L6ec
            int r1 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2 = 0
        L695:
            if (r2 >= r1) goto L6ec
            java.lang.String r3 = "statusOpening4_2"
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r2 = r2 + 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r10 = 0
            r5[r10] = r4     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r10 = 1
            r5[r10] = r4     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3, r5)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4.<init>()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4.append(r3)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4.append(r8)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7.setSavingOpeningStatusText(r3, r5)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r3 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            byte[] r5 = new byte[r3]     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r12.readFully(r5, r4, r3)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r3.<init>(r5)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r4 = new org.fortheloss.sticknodes.movieclip.MCMovieclipSource     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4.<init>()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4.readLibraryData(r11, r6, r7, r12)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4.recalculateAllNextFrameStickfigureIndicesForTweening()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4.setName(r3)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r3 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4.setUID(r3)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7.addMovieclipToLibrary(r4)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            goto L695
        L6ec:
            int r10 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r1.<init>()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7.frames = r1     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r1 = (float) r10     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r1 = r1 * r40
            int r1 = java.lang.Math.round(r1)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2 = 1
            int r14 = java.lang.Math.max(r2, r1)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r15 = r10 - r14
            r4 = 0
            r5 = 0
        L707:
            if (r4 >= r10) goto L776
            java.lang.String r1 = "statusOpening6"
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r18 = r4 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r19 = 0
            r3[r19] = r2     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r19 = 1
            r3[r19] = r2     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1, r3)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2.<init>()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2.append(r1)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2.append(r8)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7.setSavingOpeningStatusText(r1, r3)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            org.fortheloss.sticknodes.data.FrameData r3 = new org.fortheloss.sticknodes.data.FrameData     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r3.<init>(r7)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r1 = r3
            r2 = r11
            r19 = r3
            r3 = r6
            r25 = r10
            r10 = r4
            r4 = r38
            r26 = 1065353216(0x3f800000, float:1.0)
            r37 = r6
            r6 = r12
            r1.readData(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r41 != 0) goto L761
            if (r10 >= r15) goto L759
            r19.dispose()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r5 = 0
            goto L76f
        L759:
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r7.frames     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2 = r19
            r1.add(r2)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            goto L76e
        L761:
            r2 = r19
            if (r10 < r14) goto L769
            r2.dispose()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            goto L76e
        L769:
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r7.frames     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r1.add(r2)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
        L76e:
            r5 = r2
        L76f:
            r4 = r18
            r10 = r25
            r6 = r37
            goto L707
        L776:
            r37 = r6
            r26 = 1065353216(0x3f800000, float:1.0)
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r7.frames     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            org.fortheloss.sticknodes.data.IFrameData r1 = (org.fortheloss.sticknodes.data.IFrameData) r1     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2 = 1
            r1.setIsFirstFrame(r2)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r7.frames     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r3 = r1.size()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r3 = r3 - r2
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            org.fortheloss.sticknodes.data.IFrameData r1 = (org.fortheloss.sticknodes.data.IFrameData) r1     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r1.setIsLastFrame(r2)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r1 = 400(0x190, float:5.6E-43)
            if (r11 >= r1) goto L819
            java.lang.String r1 = "statusOpening9"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2.<init>()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2.append(r1)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2.append(r8)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7.setSavingOpeningStatusText(r1, r3)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            org.fortheloss.sticknodes.animationscreen.FontLoader r1 = r7.mFontLoader     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r1 = r1.getFontCount()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            boolean[] r1 = new boolean[r1]     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.util.Arrays.fill(r1, r2)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r2 = r7.frames     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r3 = 1
            int r2 = r2 - r3
        L7c9:
            if (r2 < 0) goto L7f2
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r3 = r7.frames     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            org.fortheloss.sticknodes.data.FrameData r3 = (org.fortheloss.sticknodes.data.FrameData) r3     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.util.ArrayList r3 = r3.getTextfieldBoxes()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r4 = r3.size()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r5 = 1
            int r4 = r4 - r5
        L7dd:
            if (r4 < 0) goto L7ef
            java.lang.Object r6 = r3.get(r4)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            org.fortheloss.sticknodes.TextfieldBox r6 = (org.fortheloss.sticknodes.TextfieldBox) r6     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r6 = r6.getFontID()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r1[r6] = r5     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r4 = r4 + (-1)
            r5 = 1
            goto L7dd
        L7ef:
            int r2 = r2 + (-1)
            goto L7c9
        L7f2:
            java.lang.Thread.sleep(r20)     // Catch: java.lang.InterruptedException -> L7f7 java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
        L7f5:
            r2 = 1
            goto L7fd
        L7f7:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            goto L7f5
        L7fd:
            boolean[] r3 = new boolean[r2]     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2 = 0
            r3[r2] = r2     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            org.fortheloss.sticknodes.data.ProjectData$5 r4 = new org.fortheloss.sticknodes.data.ProjectData$5     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4.<init>(r7, r1, r3)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r1.postRunnable(r4)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
        L80c:
            boolean r1 = r3[r2]     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r1 != 0) goto L817
            r1 = 250(0xfa, double:1.235E-321)
            java.lang.Thread.sleep(r1)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2 = 0
            goto L80c
        L817:
            r1 = 400(0x190, float:5.6E-43)
        L819:
            if (r11 >= r1) goto L89c
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r1 = r7.librarySprites     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r1 <= 0) goto L89c
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r1 = r7.librarySprites     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            org.fortheloss.sticknodes.sprite.SpriteSource r1 = (org.fortheloss.sticknodes.sprite.SpriteSource) r1     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r2 = r38.getUniqueFigureID()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r38.incrementUniqueFigureID()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r3 = r7.frames     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r3 = r3.size()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4 = 1
            int r3 = r3 - r4
        L83b:
            if (r3 < 0) goto L89c
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r4 = r7.frames     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            org.fortheloss.sticknodes.data.FrameData r4 = (org.fortheloss.sticknodes.data.FrameData) r4     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            boolean r5 = r4.isUsingImageBackground()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r5 != 0) goto L850
            r39 = r1
            r6 = r17
            goto L895
        L850:
            org.fortheloss.sticknodes.sprite.SpriteRef r5 = new org.fortheloss.sticknodes.sprite.SpriteRef     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r5.<init>()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r5.setSpriteSource(r1)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r6 = 0
            r5.setScaleLinked(r6)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r5.setScaleX(r9)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r6 = r17
            r5.setScaleY(r6)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r10 = r7.canvasWidth     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r10 = (float) r10     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r17 = 1056964608(0x3f000000, float:0.5)
            float r10 = r10 * r17
            float r18 = r5.getScaledWidth()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r19 = org.fortheloss.sticknodes.App.assetScaling     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r18 = r18 * r19
            float r18 = r18 * r17
            float r10 = r10 - r18
            r39 = r1
            int r1 = r7.canvasHeight     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r1 = (float) r1     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r1 = r1 * r17
            float r18 = r5.getScaledHeight()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r19 = org.fortheloss.sticknodes.App.assetScaling     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            float r18 = r18 * r19
            float r18 = r18 * r17
            float r1 = r1 - r18
            r5.setPosition(r10, r1)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r1 = 1
            r5.setLockState(r1)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r1 = 0
            r4.addFigureAt(r5, r2, r1, r7)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
        L895:
            int r3 = r3 + (-1)
            r1 = r39
            r17 = r6
            goto L83b
        L89c:
            r1 = 237(0xed, float:3.32E-43)
            if (r11 < r1) goto L916
            int r1 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
        L8a4:
            if (r1 <= 0) goto L916
            java.lang.String r2 = "statusOpening7"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r3.<init>()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r3.append(r2)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r3.append(r8)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7.setSavingOpeningStatusText(r2, r4)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r1 = r1 + (-1)
            int r2 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r3 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r4 = r12.read()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r4 == 0) goto L8d4
            r30 = 1
            goto L8d6
        L8d4:
            r30 = 0
        L8d6:
            int r4 = r12.read()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r4 == 0) goto L8df
            r31 = 1
            goto L8e1
        L8df:
            r31 = 0
        L8e1:
            r4 = 256(0x100, float:3.59E-43)
            if (r11 < r4) goto L8ec
            short r4 = r12.readShort()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r32 = r4
            goto L8ee
        L8ec:
            r32 = 0
        L8ee:
            if (r41 == 0) goto L8f3
            if (r3 < r14) goto L8f9
            goto L8f7
        L8f3:
            int r2 = r2 - r15
            int r3 = r3 - r15
            if (r2 >= 0) goto L8f9
        L8f7:
            r4 = 1
            goto L8fa
        L8f9:
            r4 = 0
        L8fa:
            if (r4 != 0) goto L8a4
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r4 = r7.frames     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.Object r2 = r4.get(r2)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r27 = r2
            org.fortheloss.sticknodes.data.FrameData r27 = (org.fortheloss.sticknodes.data.FrameData) r27     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r2 = r7.frames     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r29 = r2
            org.fortheloss.sticknodes.data.FrameData r29 = (org.fortheloss.sticknodes.data.FrameData) r29     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r28 = 0
            r27.setAutoCameraBundle(r28, r29, r30, r31, r32)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            goto L8a4
        L916:
            int r1 = r13.size()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r1 <= 0) goto L91e
            r2 = 1
            goto L91f
        L91e:
            r2 = 0
        L91f:
            java.lang.String r3 = "statusFinishing"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4.<init>()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4.append(r3)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4.append(r8)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7.setSavingOpeningStatusText(r3, r5)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r3 = r7.frames     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r3 = r3.size()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r4 = 0
        L941:
            r5 = -1
            if (r4 >= r3) goto L9b1
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r6 = r7.frames     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.Object r6 = r6.get(r4)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            org.fortheloss.sticknodes.data.IFrameData r6 = (org.fortheloss.sticknodes.data.IFrameData) r6     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r4 != 0) goto L95e
            r9 = 1
            if (r3 <= r9) goto L95c
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r9 = r7.frames     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r10 = r3 + (-1)
            java.lang.Object r9 = r9.get(r10)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
        L959:
            org.fortheloss.sticknodes.data.IFrameData r9 = (org.fortheloss.sticknodes.data.IFrameData) r9     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            goto L967
        L95c:
            r9 = 0
            goto L967
        L95e:
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r9 = r7.frames     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r10 = r4 + (-1)
            java.lang.Object r9 = r9.get(r10)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            goto L959
        L967:
            int r10 = r3 + (-1)
            if (r4 != r10) goto L97a
            r10 = 1
            if (r3 <= r10) goto L978
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r10 = r7.frames     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r14 = 0
            java.lang.Object r10 = r10.get(r14)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
        L975:
            org.fortheloss.sticknodes.data.IFrameData r10 = (org.fortheloss.sticknodes.data.IFrameData) r10     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            goto L983
        L978:
            r10 = 0
            goto L983
        L97a:
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r10 = r7.frames     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r14 = r4 + 1
            java.lang.Object r10 = r10.get(r14)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            goto L975
        L983:
            r6.restoreReferences(r9, r10)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r2 == 0) goto L9ae
            int r9 = r6.getSoundToPlayLibraryID()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r9 >= 0) goto L98f
            goto L9ae
        L98f:
            r10 = 0
            r14 = 0
        L991:
            if (r10 >= r1) goto L9aa
            java.lang.Object r15 = r13.get(r10)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.Integer r15 = (java.lang.Integer) r15     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r15 = r15.intValue()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r15 != r9) goto L9a3
            r6.setSoundToPlay(r5)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            goto L9ae
        L9a3:
            if (r15 >= r9) goto L9a7
            int r14 = r14 + 1
        L9a7:
            int r10 = r10 + 1
            goto L991
        L9aa:
            int r9 = r9 - r14
            r6.setSoundToPlay(r9)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
        L9ae:
            int r4 = r4 + 1
            goto L941
        L9b1:
            if (r2 == 0) goto La1b
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r2 = r7.libraryMovieclips     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r3 = 0
        L9ba:
            if (r3 >= r2) goto La1b
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r4 = r7.libraryMovieclips     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r4 = (org.fortheloss.sticknodes.movieclip.MCMovieclipSource) r4     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r6 = r4.frames     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r6 = r6.size()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r9 = 0
        L9cb:
            if (r9 >= r6) goto La12
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r10 = r4.frames     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.Object r10 = r10.get(r9)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            org.fortheloss.sticknodes.data.MCFrameData r10 = (org.fortheloss.sticknodes.data.MCFrameData) r10     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r14 = r10.getSoundToPlayLibraryID()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r14 >= 0) goto L9df
            r41 = r1
            r1 = -1
            goto La0c
        L9df:
            r15 = 0
            r16 = 0
        L9e2:
            if (r15 >= r1) goto La04
            java.lang.Object r17 = r13.get(r15)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.Integer r17 = (java.lang.Integer) r17     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r5 = r17.intValue()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r5 != r14) goto L9f7
            r41 = r1
            r1 = -1
            r10.setSoundToPlay(r1)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            goto La0c
        L9f7:
            r41 = r1
            r1 = -1
            if (r5 >= r14) goto L9fe
            int r16 = r16 + 1
        L9fe:
            int r15 = r15 + 1
            r1 = r41
            r5 = -1
            goto L9e2
        La04:
            r41 = r1
            r1 = -1
            int r14 = r14 - r16
            r10.setSoundToPlay(r14)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
        La0c:
            int r9 = r9 + 1
            r1 = r41
            r5 = -1
            goto L9cb
        La12:
            r41 = r1
            r1 = -1
            int r3 = r3 + 1
            r1 = r41
            r5 = -1
            goto L9ba
        La1b:
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r7.frames     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2 = 0
        La22:
            if (r2 >= r1) goto La60
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r3 = r7.frames     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            org.fortheloss.sticknodes.data.FrameData r3 = (org.fortheloss.sticknodes.data.FrameData) r3     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.util.ArrayList r4 = r3.getDrawableFigures()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r5 = r4.size()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r6 = 1
            int r5 = r5 - r6
        La36:
            if (r5 < 0) goto La5d
            java.lang.Object r6 = r4.get(r5)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            boolean r6 = r6 instanceof org.fortheloss.sticknodes.movieclip.MCReference     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r6 != 0) goto La41
            goto La5a
        La41:
            java.lang.Object r6 = r4.get(r5)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            org.fortheloss.sticknodes.movieclip.MCReference r6 = (org.fortheloss.sticknodes.movieclip.MCReference) r6     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r9 = r6.getPlaymode()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r9 == 0) goto La5a
            org.fortheloss.sticknodes.movieclip.MCReference r6 = r6.getOrigin()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r6 == 0) goto La54
            goto La5a
        La54:
            r6 = 1
            r9 = 0
            r3.refreshAllMovieclips(r6, r9)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            goto La5d
        La5a:
            int r5 = r5 + (-1)
            goto La36
        La5d:
            int r2 = r2 + 1
            goto La22
        La60:
            org.fortheloss.sticknodes.data.SessionSaveData r1 = new org.fortheloss.sticknodes.data.SessionSaveData     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r1.<init>()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7._sessionSaveData = r1     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2 = r37
            r1.readData(r11, r2, r12)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            org.fortheloss.sticknodes.data.SessionSaveData r1 = r7._sessionSaveData     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r2 = (r40 > r26 ? 1 : (r40 == r26 ? 0 : -1))
            if (r2 < 0) goto La74
            r2 = 1
            goto La75
        La74:
            r2 = 0
        La75:
            r1.projectIsFullyOpened = r2     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r1 = 319(0x13f, float:4.47E-43)
            if (r11 < r1) goto Laa0
            int r1 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            if (r1 <= 0) goto Laa0
            int[][] r2 = new int[r1][]     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7._savedCacheLibraryIDs = r2     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2 = 0
        La86:
            if (r2 >= r1) goto Laa0
            int r3 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r4 = r12.readInt()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int[][] r5 = r7._savedCacheLibraryIDs     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r6 = 2
            int[] r9 = new int[r6]     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r6 = 0
            r9[r6] = r3     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r3 = 1
            r9[r3] = r4     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r5[r2] = r9     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            int r2 = r2 + 1
            goto La86
        Laa0:
            java.lang.String r1 = "statusOpening8"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2.<init>()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2.append(r1)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2.append(r8)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r7.setSavingOpeningStatusText(r1, r3)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            java.lang.Thread.sleep(r20)     // Catch: java.lang.InterruptedException -> Labf java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            goto Lac4
        Labf:
            r0 = move-exception
            r1 = r0
            r1.printStackTrace()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
        Lac4:
            org.fortheloss.sticknodes.data.ProjectData$6 r1 = new org.fortheloss.sticknodes.data.ProjectData$6     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r1.<init>(r7)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            com.badlogic.gdx.Application r2 = com.badlogic.gdx.Gdx.app     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r2.postRunnable(r1)     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            r1.join()     // Catch: java.lang.InterruptedException -> Lad2 java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            goto Lb05
        Lad2:
            r0 = move-exception
            r1 = r0
            r1.printStackTrace()     // Catch: java.lang.Throwable -> Lad8 java.lang.Exception -> Ladb java.lang.OutOfMemoryError -> Laed
            goto Lb05
        Lad8:
            r0 = move-exception
            r1 = r0
            goto Lafd
        Ladb:
            r0 = move-exception
            r1 = r0
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform     // Catch: java.lang.Throwable -> Lad8
            r2.logNonFatalException(r1)     // Catch: java.lang.Throwable -> Lad8
            r1.printStackTrace()     // Catch: java.lang.Throwable -> Lad8
            if (r12 == 0) goto Laea
        Lae7:
            r12.close()     // Catch: java.io.IOException -> Laea
        Laea:
            r1 = 0
            r13 = 0
            goto Lb0d
        Laed:
            r0 = move-exception
            r1 = r0
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform     // Catch: java.lang.Throwable -> Lad8
            r2.logNonFatalException(r1)     // Catch: java.lang.Throwable -> Lad8
            r1.printStackTrace()     // Catch: java.lang.Throwable -> Lad8
            r1 = 2
            org.fortheloss.sticknodes.animationscreen.AnimationScreen.onOpenFlag = r1     // Catch: java.lang.Throwable -> Lad8
            if (r12 == 0) goto Laea
            goto Lae7
        Lafd:
            if (r12 == 0) goto Lb02
            r12.close()     // Catch: java.io.IOException -> Lb02
        Lb02:
            throw r1
        Lb03:
            r24 = r13
        Lb05:
            if (r12 == 0) goto Lb0a
            r12.close()     // Catch: java.io.IOException -> Lb0a
        Lb0a:
            r13 = r24
            r1 = 0
        Lb0d:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = ""
            r7.setSavingOpeningStatusText(r2, r1)
            return r13
    }

    public boolean openProjectOld(com.badlogic.gdx.files.FileHandle r33, float r34, boolean r35) {
            r32 = this;
            r1 = r32
            java.lang.String r2 = "statusOldProject"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.String r4 = "statusOpening1"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "("
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = ") "
            r5.append(r3)
            r5.append(r4)
            java.lang.String r4 = "..."
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            r7 = 0
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r1.setSavingOpeningStatusText(r5, r8)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            r8 = 1156579328(0x44f00000, float:1920.0)
            float r9 = r5 * r8
            int r9 = (int) r9
            r1.canvasWidth = r9
            r9 = 1149698048(0x44870000, float:1080.0)
            float r5 = r5 * r9
            int r5 = (int) r5
            r1.canvasHeight = r5
            r5 = 2
            r10 = 1
            java.lang.String r11 = org.fortheloss.sticknodes.App.localize(r2)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.String r12 = "statusOpening2"
            java.lang.String r12 = org.fortheloss.sticknodes.App.localize(r12)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r13.<init>()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r13.append(r6)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r13.append(r11)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r13.append(r3)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r13.append(r12)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r13.append(r4)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.String r11 = r13.toString()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r1.setSavingOpeningStatusText(r11, r12)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            byte[] r11 = r33.readBytes()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            byte[] r11 = org.fortheloss.sticknodes.App.inflate(r11)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.wrap(r11)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.nio.ByteOrder r12 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r11.order(r12)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            int r12 = r11.getInt()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            org.fortheloss.framework.IPlatform r13 = org.fortheloss.sticknodes.App.platform     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.String r14 = "opening_project_version"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r15.<init>()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r15.append(r12)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.String r15 = r15.toString()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r13.setCrashlyticsKeyString(r14, r15)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            org.fortheloss.framework.IPlatform r13 = org.fortheloss.sticknodes.App.platform     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.String r14 = "opening_project_build"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r15.<init>()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r15.append(r7)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.String r15 = r15.toString()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r13.setCrashlyticsKeyString(r14, r15)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            int r13 = r11.getInt()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            byte[] r14 = new byte[r13]     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r11.get(r14, r7, r13)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.String r13 = new java.lang.String     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r13.<init>(r14)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r1.projectName = r13     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.String r13 = r33.nameWithoutExtension()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r1.projectName = r13     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r13 = 1065353216(0x3f800000, float:1.0)
            int r14 = (r34 > r13 ? 1 : (r34 == r13 ? 0 : -1))
            if (r14 >= 0) goto L105
            r14 = 1120403456(0x42c80000, float:100.0)
            float r14 = r14 * r34
            int r14 = java.lang.Math.round(r14)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.String r15 = "_"
            if (r35 == 0) goto Lea
            java.lang.String r13 = r1.projectName     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r8.<init>()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r8.append(r13)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r8.append(r15)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r8.append(r14)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.String r13 = "_percent_from_first_frame"
            r8.append(r13)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r1.projectName = r8     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            goto L105
        Lea:
            java.lang.String r8 = r1.projectName     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r13.<init>()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r13.append(r8)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r13.append(r15)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r13.append(r14)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.String r8 = "_percent_from_last_frame"
            r13.append(r8)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.String r8 = r13.toString()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r1.projectName = r8     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
        L105:
            r1.isYoutubeShorts = r7     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r1.watermarkEnabled = r7     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.String r8 = ":)"
            r1.watermarkText = r8     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            com.badlogic.gdx.graphics.Color r8 = new com.badlogic.gdx.graphics.Color     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            com.badlogic.gdx.graphics.Color r13 = org.fortheloss.sticknodes.App.COLOR_RED     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r8.<init>(r13)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r1.watermarkColor = r8     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            int r8 = r11.getInt()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r1.fps = r8     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r1.numTweenedFrames = r5     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r8 = 127(0x7f, float:1.78E-43)
            if (r12 < r8) goto L12a
            byte r13 = r11.get()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            if (r13 == 0) goto L12a
            r13 = 1
            goto L12b
        L12a:
            r13 = 0
        L12b:
            r1.hasShownLoopMessage = r13     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r13 = 113(0x71, float:1.58E-43)
            if (r12 < r13) goto L139
            byte r13 = r11.get()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            if (r13 == 0) goto L139
            r13 = 1
            goto L13a
        L139:
            r13 = 0
        L13a:
            r1.hasShownPanningModeMessage = r13     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            byte r13 = r11.get()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            if (r13 == 0) goto L144
            r13 = 1
            goto L145
        L144:
            r13 = 0
        L145:
            r1.hasShownTweeningMessage = r13     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r1.hasShownMagnifierMessage = r7     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            byte r13 = r11.get()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            if (r13 == 0) goto L151
            r13 = 1
            goto L152
        L151:
            r13 = 0
        L152:
            r1.tweeningEnabled = r13     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            if (r12 < r8) goto L15e
            byte r8 = r11.get()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            if (r8 == 0) goto L15e
            r8 = 1
            goto L15f
        L15e:
            r8 = 0
        L15f:
            r1.isLoop = r8     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r8 = 140(0x8c, float:1.96E-43)
            if (r12 < r8) goto L168
            r11.get()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
        L168:
            int r13 = r11.getInt()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r1._uniqueFigureID = r13     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            org.fortheloss.sticknodes.data.ProjectData.uniqueTextfieldBoxID = r7     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            org.fortheloss.sticknodes.data.ProjectData.uniqueMovieclipID = r7     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            org.fortheloss.sticknodes.data.ProjectData.framesContainerUID = r10     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r1._uid = r7     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r13.<init>()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r1.hiddenStickfigureLibraryIDs = r13     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r13.<init>()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r1.hiddenMovieclipLibraryIDs = r13     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r13.<init>()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r1.hiddenSpriteLibraryIDs = r13     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.util.HashMap r13 = new java.util.HashMap     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r13.<init>()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r1._idConversionMaps = r13     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            if (r12 < r8) goto L19c
            byte r8 = r11.get()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            if (r8 == 0) goto L19c
            r8 = 1
            goto L19d
        L19c:
            r8 = 0
        L19d:
            if (r8 == 0) goto L2de
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r2)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.String r14 = "statusOpening3"
            java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r15.<init>()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r15.append(r6)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r15.append(r8)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r15.append(r3)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r15.append(r14)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r15.append(r4)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.String r8 = r15.toString()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r1.setSavingOpeningStatusText(r8, r14)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            byte r8 = r11.get()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            if (r8 != 0) goto L1ce
            r8 = 1
            goto L1cf
        L1ce:
            r8 = 0
        L1cf:
            int r14 = r11.getInt()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            int r15 = r11.getInt()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            int r17 = r14 * r15
            int r13 = r17 * 3
            byte[] r10 = new byte[r13]     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r11.get(r10, r7, r13)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            com.badlogic.gdx.graphics.Pixmap r7 = new com.badlogic.gdx.graphics.Pixmap     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            com.badlogic.gdx.graphics.Pixmap$Format r5 = com.badlogic.gdx.graphics.Pixmap.Format.RGB888     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r7.<init>(r14, r15, r5)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r5 = 0
            r17 = 0
        L1ea:
            if (r5 >= r13) goto L21c
            r9 = r10[r5]     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << 24
            int r19 = r5 + 1
            r20 = r13
            r13 = r10[r19]     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 16
            r9 = r9 | r13
            int r13 = r5 + 2
            r13 = r10[r13]     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 8
            r9 = r9 | r13
            r9 = r9 | 255(0xff, float:3.57E-43)
            int r13 = r17 % r14
            r19 = r10
            int r10 = r17 / r14
            r7.drawPixel(r13, r10, r9)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            int r5 = r5 + 3
            int r17 = r17 + 1
            r10 = r19
            r13 = r20
            r9 = 1149698048(0x44870000, float:1080.0)
            goto L1ea
        L21c:
            if (r8 == 0) goto L247
            int r5 = r1.canvasWidth     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            float r5 = (float) r5     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            float r8 = (float) r14     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            float r5 = r5 / r8
            int r8 = r1.canvasHeight     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            float r8 = (float) r8     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            float r9 = (float) r15     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            float r8 = r8 / r9
            r9 = 1028443341(0x3d4ccccd, float:0.05)
            float r5 = r5 / r9
            double r9 = (double) r5     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            double r9 = java.lang.Math.ceil(r9)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            int r5 = (int) r9     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            float r5 = (float) r5     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r9 = 1028443341(0x3d4ccccd, float:0.05)
            float r5 = r5 * r9
            float r8 = r8 / r9
            double r9 = (double) r8     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            double r8 = java.lang.Math.ceil(r9)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            int r8 = (int) r8     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            float r8 = (float) r8     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r9 = 1028443341(0x3d4ccccd, float:0.05)
            float r8 = r8 * r9
            r13 = r5
            goto L24b
        L247:
            r8 = 1065353216(0x3f800000, float:1.0)
            r13 = 1065353216(0x3f800000, float:1.0)
        L24b:
            com.badlogic.gdx.utils.Scaling r5 = com.badlogic.gdx.utils.Scaling.fit     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            float r9 = (float) r14     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            float r10 = (float) r15     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r33 = r8
            r27 = r12
            r16 = r13
            r8 = 1149698048(0x44870000, float:1080.0)
            r13 = 1156579328(0x44f00000, float:1920.0)
            com.badlogic.gdx.math.Vector2 r12 = r5.apply(r9, r10, r13, r8)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            float r8 = r12.x     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r21 = r14
            double r13 = (double) r8     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            double r13 = java.lang.Math.ceil(r13)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            float r8 = (float) r13     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            float r13 = r8 / r9
            float r8 = r12.y     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r12 = r3
            r14 = r4
            double r3 = (double) r8     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            double r3 = java.lang.Math.ceil(r3)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            float r3 = (float) r3     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            float r3 = r3 / r10
            r4 = r21
            if (r4 < r15) goto L27b
            r8 = 1156579328(0x44f00000, float:1920.0)
            goto L27d
        L27b:
            r8 = 1149698048(0x44870000, float:1080.0)
        L27d:
            r28 = r12
            if (r4 < r15) goto L284
            r12 = 1149698048(0x44870000, float:1080.0)
            goto L286
        L284:
            r12 = 1156579328(0x44f00000, float:1920.0)
        L286:
            int r17 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r17 > 0) goto L29d
            int r17 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r17 <= 0) goto L28f
            goto L29d
        L28f:
            r5 = r33
            r30 = r6
            r29 = r14
        L295:
            r4 = r16
            r31 = r13
            r13 = r3
            r3 = r31
            goto L2ef
        L29d:
            com.badlogic.gdx.math.Vector2 r5 = r5.apply(r9, r10, r8, r12)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            com.badlogic.gdx.graphics.Pixmap r8 = new com.badlogic.gdx.graphics.Pixmap     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            float r12 = r5.x     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            int r12 = (int) r12     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r29 = r14
            float r14 = r5.y     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            int r14 = (int) r14     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r30 = r6
            com.badlogic.gdx.graphics.Pixmap$Format r6 = com.badlogic.gdx.graphics.Pixmap.Format.RGB888     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r8.<init>(r12, r14, r6)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r19 = 0
            r20 = 0
            r23 = 0
            r24 = 0
            float r6 = r5.x     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            int r6 = (int) r6     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            float r12 = r5.y     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            int r12 = (int) r12     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r17 = r8
            r18 = r7
            r21 = r4
            r22 = r15
            r25 = r6
            r26 = r12
            r17.drawPixmap(r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            float r4 = r5.x     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            float r4 = r4 / r9
            float r13 = r13 / r4
            float r4 = r5.y     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            float r4 = r4 / r10
            float r3 = r3 / r4
            r7.dispose()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r5 = r33
            r7 = r8
            goto L295
        L2de:
            r28 = r3
            r29 = r4
            r30 = r6
            r27 = r12
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
        L2ef:
            int r6 = r11.getInt()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r8.<init>()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r1.libraryStickfigures = r8     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r8 = 0
        L2fb:
            if (r8 >= r6) goto L365
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r2)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.String r10 = "statusOpening4"
            r12 = 2
            java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            int r8 = r8 + 1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r15 = 0
            r14[r15] = r12     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r15 = 1
            r14[r15] = r12     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r10, r14)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r12.<init>()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r14 = r30
            r12.append(r14)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r12.append(r9)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r9 = r28
            r12.append(r9)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r12.append(r10)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r10 = r29
            r12.append(r10)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r33 = r6
            r15 = 0
            java.lang.Object[] r6 = new java.lang.Object[r15]     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r1.setSavingOpeningStatusText(r12, r6)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            int r6 = r11.getInt()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            byte[] r12 = new byte[r6]     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r11.get(r12, r15, r6)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r6.<init>(r12)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            org.fortheloss.sticknodes.stickfigure.Stickfigure r12 = new org.fortheloss.sticknodes.stickfigure.Stickfigure     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r12.<init>()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r12.readDataOld(r11)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r12.setName(r6)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r1.addStickfigureToLibrary(r12)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r6 = r33
            r28 = r9
            r29 = r10
            r30 = r14
            goto L2fb
        L365:
            r9 = r28
            r10 = r29
            r14 = r30
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r6.<init>()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r1.librarySoundDatas = r6     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r6.<init>()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r1.soundsNotFound = r6     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r6.<init>()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r1.librarySprites = r6     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            if (r7 == 0) goto L391
            com.badlogic.gdx.Application r6 = com.badlogic.gdx.Gdx.app     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            org.fortheloss.sticknodes.data.ProjectData$7 r8 = new org.fortheloss.sticknodes.data.ProjectData$7     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r8.<init>(r1, r7, r3, r13)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r6.postRunnable(r8)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r6 = 500(0x1f4, double:2.47E-321)
            java.lang.Thread.sleep(r6)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
        L391:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r3.<init>()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r1.libraryMovieclips = r3     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            int r3 = r11.getInt()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r6.<init>()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r1.frames = r6     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            float r6 = (float) r3     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            float r6 = r6 * r34
            int r6 = java.lang.Math.round(r6)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r7 = 1
            int r6 = java.lang.Math.max(r7, r6)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            int r7 = r3 - r6
            r8 = 0
        L3b2:
            if (r8 >= r3) goto L41c
            java.lang.String r12 = org.fortheloss.sticknodes.App.localize(r2)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.String r13 = "statusOpening6"
            r16 = r2
            r15 = 2
            java.lang.Object[] r2 = new java.lang.Object[r15]     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            int r15 = r8 + 1
            java.lang.Integer r17 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r18 = 0
            r2[r18] = r17     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.Integer r17 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r18 = 1
            r2[r18] = r17     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r13, r2)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r13.<init>()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r13.append(r14)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r13.append(r12)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r13.append(r9)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r13.append(r2)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r13.append(r10)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.String r2 = r13.toString()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r12 = 0
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r1.setSavingOpeningStatusText(r2, r13)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            org.fortheloss.sticknodes.data.FrameData r2 = new org.fortheloss.sticknodes.data.FrameData     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r2.<init>(r1)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r12 = r27
            r2.readDataOld(r12, r1, r11)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            if (r35 != 0) goto L40b
            if (r8 >= r7) goto L405
            r2.dispose()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            goto L416
        L405:
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r8 = r1.frames     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r8.add(r2)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            goto L416
        L40b:
            if (r8 < r6) goto L411
            r2.dispose()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            goto L416
        L411:
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r8 = r1.frames     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r8.add(r2)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
        L416:
            r27 = r12
            r8 = r15
            r2 = r16
            goto L3b2
        L41c:
            r16 = r2
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r2 = r1.frames     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r3 = 0
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            org.fortheloss.sticknodes.data.IFrameData r2 = (org.fortheloss.sticknodes.data.IFrameData) r2     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r3 = 1
            r2.setIsFirstFrame(r3)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r2 = r1.frames     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            int r6 = r2.size()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            int r6 = r6 - r3
            java.lang.Object r2 = r2.get(r6)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            org.fortheloss.sticknodes.data.IFrameData r2 = (org.fortheloss.sticknodes.data.IFrameData) r2     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r2.setIsLastFrame(r3)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r2 = r1.librarySprites     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            int r2 = r2.size()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            if (r2 <= 0) goto L4ae
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r2 = r1.librarySprites     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r3 = 0
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            org.fortheloss.sticknodes.sprite.SpriteSource r2 = (org.fortheloss.sticknodes.sprite.SpriteSource) r2     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            int r3 = r32.getUniqueFigureID()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r32.incrementUniqueFigureID()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r6 = r1.frames     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            int r6 = r6.size()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r7 = 1
            int r6 = r6 - r7
        L45b:
            if (r6 < 0) goto L4ae
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r7 = r1.frames     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.Object r7 = r7.get(r6)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            org.fortheloss.sticknodes.data.FrameData r7 = (org.fortheloss.sticknodes.data.FrameData) r7     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            boolean r8 = r7.isUsingImageBackground()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            if (r8 != 0) goto L46c
            goto L4ab
        L46c:
            org.fortheloss.sticknodes.sprite.SpriteRef r8 = new org.fortheloss.sticknodes.sprite.SpriteRef     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r8.<init>()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r8.setSpriteSource(r2)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r11 = 0
            r8.setScaleLinked(r11)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r8.setScaleX(r4)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r8.setScaleY(r5)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            int r11 = r1.canvasWidth     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            float r11 = (float) r11     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r12 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11 * r12
            float r13 = r8.getScaledWidth()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            float r15 = org.fortheloss.sticknodes.App.assetScaling     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            float r13 = r13 * r15
            float r13 = r13 * r12
            float r11 = r11 - r13
            int r13 = r1.canvasHeight     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            float r13 = (float) r13     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            float r13 = r13 * r12
            float r15 = r8.getScaledHeight()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            float r17 = org.fortheloss.sticknodes.App.assetScaling     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            float r15 = r15 * r17
            float r15 = r15 * r12
            float r13 = r13 - r15
            r8.setPosition(r11, r13)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r11 = 1
            r8.setLockState(r11)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r11 = 0
            r7.addFigureAt(r8, r3, r11, r1)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
        L4ab:
            int r6 = r6 + (-1)
            goto L45b
        L4ae:
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r16)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.String r3 = "statusFinishing"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r4.<init>()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r4.append(r14)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r4.append(r2)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r4.append(r9)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r4.append(r3)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r4.append(r10)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r1.setSavingOpeningStatusText(r2, r4)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r2 = r1.frames     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            int r2 = r2.size()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r3 = 0
        L4dd:
            if (r3 >= r2) goto L525
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r4 = r1.frames     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            org.fortheloss.sticknodes.data.IFrameData r4 = (org.fortheloss.sticknodes.data.IFrameData) r4     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            if (r3 != 0) goto L4f9
            r5 = 1
            if (r2 <= r5) goto L4f7
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r5 = r1.frames     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            int r6 = r2 + (-1)
            java.lang.Object r5 = r5.get(r6)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
        L4f4:
            org.fortheloss.sticknodes.data.IFrameData r5 = (org.fortheloss.sticknodes.data.IFrameData) r5     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            goto L502
        L4f7:
            r5 = 0
            goto L502
        L4f9:
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r5 = r1.frames     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            int r6 = r3 + (-1)
            java.lang.Object r5 = r5.get(r6)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            goto L4f4
        L502:
            int r6 = r2 + (-1)
            if (r3 != r6) goto L515
            r6 = 1
            if (r2 <= r6) goto L513
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r7 = r1.frames     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r8 = 0
            java.lang.Object r7 = r7.get(r8)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
        L510:
            org.fortheloss.sticknodes.data.IFrameData r7 = (org.fortheloss.sticknodes.data.IFrameData) r7     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            goto L51f
        L513:
            r7 = 0
            goto L51f
        L515:
            r6 = 1
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r7 = r1.frames     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            int r8 = r3 + 1
            java.lang.Object r7 = r7.get(r8)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            goto L510
        L51f:
            r4.restoreReferences(r5, r7)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            int r3 = r3 + 1
            goto L4dd
        L525:
            r6 = 1
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r16)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.String r3 = "statusOpening8"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r4.<init>()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r4.append(r14)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r4.append(r2)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r4.append(r9)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r4.append(r3)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r4.append(r10)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r1.setSavingOpeningStatusText(r2, r4)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r2 = 50
            java.lang.Thread.sleep(r2)     // Catch: java.lang.InterruptedException -> L554 java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            goto L559
        L554:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
        L559:
            org.fortheloss.sticknodes.data.ProjectData$8 r2 = new org.fortheloss.sticknodes.data.ProjectData$8     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r2.<init>(r1)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            com.badlogic.gdx.Application r3 = com.badlogic.gdx.Gdx.app     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r3.postRunnable(r2)     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            r2.join()     // Catch: java.lang.InterruptedException -> L567 java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
            goto L56c
        L567:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()     // Catch: java.lang.Exception -> L56f java.lang.OutOfMemoryError -> L57a
        L56c:
            r2 = 0
            r10 = 1
            goto L589
        L56f:
            r0 = move-exception
            r2 = r0
            org.fortheloss.framework.IPlatform r3 = org.fortheloss.sticknodes.App.platform
            r3.logNonFatalException(r2)
            r2.printStackTrace()
            goto L587
        L57a:
            r0 = move-exception
            r2 = r0
            org.fortheloss.framework.IPlatform r3 = org.fortheloss.sticknodes.App.platform
            r3.logNonFatalException(r2)
            r2.printStackTrace()
            r2 = 2
            org.fortheloss.sticknodes.animationscreen.AnimationScreen.onOpenFlag = r2
        L587:
            r2 = 0
            r10 = 0
        L589:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = ""
            r1.setSavingOpeningStatusText(r3, r2)
            return r10
    }

    public boolean save(org.fortheloss.sticknodes.animationscreen.AnimationScreen r18) {
            r17 = this;
            r1 = r17
            java.lang.String r2 = "statusSaving1"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "..."
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r1.setSavingOpeningStatusText(r3, r5)
            java.lang.String r3 = org.fortheloss.sticknodes.App.projectsPath
            java.lang.String r5 = r1.projectName
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            r6.append(r5)
            java.lang.String r3 = ".stknds"
            r6.append(r3)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = org.fortheloss.sticknodes.App.tempPath
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.String r6 = "tempSavedProjectFile.stknds"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = org.fortheloss.sticknodes.App.tempPath
            java.lang.String r8 = r1.projectName
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r8)
            r9.append(r3)
            java.lang.String r3 = r9.toString()
            r7 = 0
            r8 = 1
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L70 java.io.FileNotFoundException -> L76
            r9.<init>(r6)     // Catch: java.io.IOException -> L70 java.io.FileNotFoundException -> L76
            java.util.zip.GZIPOutputStream r10 = new java.util.zip.GZIPOutputStream     // Catch: java.io.IOException -> L70 java.io.FileNotFoundException -> L76
            r11 = 4096(0x1000, float:5.74E-42)
            r10.<init>(r9, r11)     // Catch: java.io.IOException -> L70 java.io.FileNotFoundException -> L76
            r9 = 1
            goto L7d
        L70:
            r0 = move-exception
            r9 = r0
            r9.printStackTrace()
            goto L7b
        L76:
            r0 = move-exception
            r9 = r0
            r9.printStackTrace()
        L7b:
            r10 = r7
            r9 = 0
        L7d:
            if (r9 != 0) goto L87
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.String r3 = "Not enough space: Error 01"
            r2.println(r3)
            return r4
        L87:
            java.lang.String r9 = "statusSaving2"
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r9)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r11.<init>()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r11.append(r9)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r11.append(r2)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.String r9 = r11.toString()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r1.setSavingOpeningStatusText(r9, r11)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r9 = 425(0x1a9, float:5.96E-43)
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r9, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r9 = 100
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r9, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.String r9 = r1.projectName     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            byte[] r9 = r9.getBytes()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r11 = r9.length     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r11, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r10.write(r9)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            boolean r9 = r1.isYoutubeShorts     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            if (r9 == 0) goto Lbe
            r9 = 1
            goto Lbf
        Lbe:
            r9 = 0
        Lbf:
            r10.write(r9)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            boolean r9 = r1.watermarkEnabled     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            if (r9 == 0) goto Lc8
            r9 = 1
            goto Lc9
        Lc8:
            r9 = 0
        Lc9:
            r10.write(r9)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.String r9 = r1.watermarkText     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r9 = r9.length()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            if (r9 <= 0) goto Le2
            java.lang.String r9 = r1.watermarkText     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            byte[] r9 = r9.getBytes()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r11 = r9.length     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r11, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r10.write(r9)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            goto Le5
        Le2:
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r4, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
        Le5:
            com.badlogic.gdx.graphics.Color r9 = r1.watermarkColor     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r9 = r9.toIntBits()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r9, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r9 = r1.fps     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r9, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r9 = r1.numTweenedFrames     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r9, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            boolean r9 = r1.hasShownLoopMessage     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            if (r9 == 0) goto Lfe
            r9 = 1
            goto Lff
        Lfe:
            r9 = 0
        Lff:
            r10.write(r9)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            boolean r9 = r1.hasShownPanningModeMessage     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            if (r9 == 0) goto L108
            r9 = 1
            goto L109
        L108:
            r9 = 0
        L109:
            r10.write(r9)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            boolean r9 = r1.hasShownTweeningMessage     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            if (r9 == 0) goto L112
            r9 = 1
            goto L113
        L112:
            r9 = 0
        L113:
            r10.write(r9)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            boolean r9 = r1.hasShownMagnifierMessage     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            if (r9 == 0) goto L11c
            r9 = 1
            goto L11d
        L11c:
            r9 = 0
        L11d:
            r10.write(r9)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            boolean r9 = r1.tweeningEnabled     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            if (r9 == 0) goto L126
            r9 = 1
            goto L127
        L126:
            r9 = 0
        L127:
            r10.write(r9)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            boolean r9 = r1.isLoop     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            if (r9 == 0) goto L130
            r9 = 1
            goto L131
        L130:
            r9 = 0
        L131:
            r10.write(r9)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r9 = r1._uniqueFigureID     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r9, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r9 = org.fortheloss.sticknodes.data.ProjectData.uniqueTextfieldBoxID     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r9, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r9 = org.fortheloss.sticknodes.data.ProjectData.uniqueMovieclipID     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r9, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r9 = org.fortheloss.sticknodes.data.ProjectData.framesContainerUID     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r9, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.animationscreen.FontLoader r9 = r1.mFontLoader     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            boolean[] r9 = r9.getFontLoadedStatus()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r11 = r9.length     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r11, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r12 = 0
        L153:
            if (r12 >= r11) goto L162
            boolean r13 = r9[r12]     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            if (r13 == 0) goto L15b
            r13 = 1
            goto L15c
        L15b:
            r13 = 0
        L15c:
            r10.write(r13)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r12 = r12 + 1
            goto L153
        L162:
            java.util.ArrayList<java.lang.Integer> r9 = r1.hiddenStickfigureLibraryIDs     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r9 = r9.size()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r9, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r11 = 0
        L16c:
            if (r11 >= r9) goto L180
            java.util.ArrayList<java.lang.Integer> r12 = r1.hiddenStickfigureLibraryIDs     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Object r12 = r12.get(r11)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r12 = r12.intValue()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r12, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r11 = r11 + 1
            goto L16c
        L180:
            java.util.ArrayList<java.lang.Integer> r9 = r1.hiddenMovieclipLibraryIDs     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r9 = r9.size()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r9, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r11 = 0
        L18a:
            if (r11 >= r9) goto L19e
            java.util.ArrayList<java.lang.Integer> r12 = r1.hiddenMovieclipLibraryIDs     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Object r12 = r12.get(r11)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r12 = r12.intValue()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r12, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r11 = r11 + 1
            goto L18a
        L19e:
            java.util.ArrayList<java.lang.Integer> r9 = r1.hiddenSpriteLibraryIDs     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r9 = r9.size()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r9, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r11 = 0
        L1a8:
            if (r11 >= r9) goto L1bc
            java.util.ArrayList<java.lang.Integer> r12 = r1.hiddenSpriteLibraryIDs     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Object r12 = r12.get(r11)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r12 = r12.intValue()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r12, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r11 = r11 + 1
            goto L1a8
        L1bc:
            java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.Integer, java.lang.Integer>>> r9 = r1._idConversionMaps     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r9 = r9.size()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r9, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.Integer, java.lang.Integer>>> r9 = r1._idConversionMaps     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.util.Set r9 = r9.entrySet()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
        L1cf:
            boolean r11 = r9.hasNext()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            if (r11 == 0) goto L25e
            java.lang.Object r11 = r9.next()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Object r12 = r11.getKey()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r12 = r12.intValue()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Object r13 = r11.getValue()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.util.HashMap r13 = (java.util.HashMap) r13     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r13 = r13.size()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r12, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r13, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Object r11 = r11.getValue()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.util.HashMap r11 = (java.util.HashMap) r11     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.util.Set r11 = r11.entrySet()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
        L203:
            boolean r12 = r11.hasNext()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            if (r12 == 0) goto L1cf
            java.lang.Object r12 = r11.next()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Object r13 = r12.getKey()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r13 = r13.intValue()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Object r14 = r12.getValue()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.util.HashMap r14 = (java.util.HashMap) r14     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r14 = r14.size()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r13, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r14, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Object r12 = r12.getValue()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.util.HashMap r12 = (java.util.HashMap) r12     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.util.Set r12 = r12.entrySet()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
        L237:
            boolean r13 = r12.hasNext()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            if (r13 == 0) goto L203
            java.lang.Object r13 = r12.next()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Object r14 = r13.getKey()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r14 = r14.intValue()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Object r13 = r13.getValue()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r13 = r13.intValue()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r14, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r13, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            goto L237
        L25e:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r9 = r1.libraryStickfigures     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r9 = r9.size()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r9, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r9 = r1.libraryStickfigures     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r9 = r9.size()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r11 = 0
        L26e:
            r12 = 2
            if (r11 >= r9) goto L2b7
            java.lang.String r13 = "statusSaving4"
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r14 = r11 + 1
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r12[r4] = r15     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Integer r15 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r12[r8] = r15     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.String r12 = org.fortheloss.sticknodes.App.localize(r13, r12)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r13.<init>()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r13.append(r12)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r13.append(r2)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.String r12 = r13.toString()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Object[] r13 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r1.setSavingOpeningStatusText(r12, r13)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r12 = r1.libraryStickfigures     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Object r11 = r12.get(r11)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.stickfigure.Stickfigure r11 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r11     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.String r12 = r11.getName()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            byte[] r12 = r12.getBytes()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r13 = r12.length     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r13, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r10.write(r12)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r11.writeData(r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r11 = r14
            goto L26e
        L2b7:
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r9 = r1.librarySoundDatas     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r9 = r9.size()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r9, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r9 = r1.librarySoundDatas     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r9 = r9.size()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r11 = 0
        L2c7:
            if (r11 >= r9) goto L30a
            java.lang.String r13 = "statusSaving5"
            java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r15 = r11 + 1
            java.lang.Integer r16 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r14[r4] = r16     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Integer r16 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r14[r8] = r16     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r13, r14)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r14.<init>()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r14.append(r13)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r14.append(r2)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.String r13 = r14.toString()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Object[] r14 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r1.setSavingOpeningStatusText(r13, r14)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r13 = r1.librarySoundDatas     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Object r11 = r13.get(r11)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.data.SoundData r11 = (org.fortheloss.sticknodes.data.SoundData) r11     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.String r11 = r11.fileName     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            byte[] r11 = r11.getBytes()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r13 = r11.length     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r13, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r10.write(r11)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r11 = r15
            goto L2c7
        L30a:
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r9 = r1.librarySprites     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r9 = r9.size()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r9, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r9 = r1.librarySprites     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r9 = r9.size()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r11 = 0
        L31a:
            if (r11 >= r9) goto L36c
            java.lang.String r13 = "statusSaving4_3"
            java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r15 = r11 + 1
            java.lang.Integer r16 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r14[r4] = r16     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Integer r16 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r14[r8] = r16     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r13, r14)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r14.<init>()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r14.append(r13)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r14.append(r2)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.String r13 = r14.toString()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Object[] r14 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r1.setSavingOpeningStatusText(r13, r14)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r13 = r1.librarySprites     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Object r11 = r13.get(r11)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.sprite.ISpriteSource r11 = (org.fortheloss.sticknodes.sprite.ISpriteSource) r11     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            boolean r13 = r11 instanceof org.fortheloss.sticknodes.sprite.SpriteGroupSource     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            if (r13 == 0) goto L354
            r13 = 1
            goto L355
        L354:
            r13 = 0
        L355:
            r10.write(r13)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.String r13 = r11.getName()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            byte[] r13 = r13.getBytes()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r14 = r13.length     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r14, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r10.write(r13)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r11.writeLibraryData(r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r11 = r15
            goto L31a
        L36c:
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r9 = r1.libraryMovieclips     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r9 = r9.size()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r9, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r9 = r1.libraryMovieclips     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r9 = r9.size()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r11 = 0
        L37c:
            if (r11 >= r9) goto L3cb
            java.lang.String r13 = "statusSaving4_2"
            java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r15 = r11 + 1
            java.lang.Integer r16 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r14[r4] = r16     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Integer r16 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r14[r8] = r16     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r13, r14)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r14.<init>()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r14.append(r13)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r14.append(r2)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.String r13 = r14.toString()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Object[] r14 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r1.setSavingOpeningStatusText(r13, r14)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r13 = r1.libraryMovieclips     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Object r11 = r13.get(r11)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r11 = (org.fortheloss.sticknodes.movieclip.MCMovieclipSource) r11     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.String r13 = r11.getName()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            byte[] r13 = r13.getBytes()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r14 = r13.length     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r14, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r10.write(r13)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r11.writeLibraryData(r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r11 = r11.getUID()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r11, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r11 = r15
            goto L37c
        L3cb:
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r9 = r1.frames     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r9 = r9.size()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r9, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r9 = r1.frames     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r9 = r9.size()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r11 = 0
        L3db:
            if (r11 >= r9) goto L414
            java.lang.String r13 = "statusSaving6"
            java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r15 = r11 + 1
            java.lang.Integer r16 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r14[r4] = r16     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Integer r16 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r14[r8] = r16     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r13, r14)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r14.<init>()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r14.append(r13)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r14.append(r2)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.String r13 = r14.toString()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Object[] r14 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r1.setSavingOpeningStatusText(r13, r14)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r13 = r1.frames     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Object r11 = r13.get(r11)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.data.FrameData r11 = (org.fortheloss.sticknodes.data.FrameData) r11     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r11.getData(r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r11 = r15
            goto L3db
        L414:
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r9 = r1.frames     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r9 = r9.size()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r11 = 0
            r12 = 0
        L41c:
            if (r11 >= r9) goto L431
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r13 = r1.frames     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Object r13 = r13.get(r11)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.data.FrameData r13 = (org.fortheloss.sticknodes.data.FrameData) r13     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            boolean r13 = r13.isAutoCameraOriginFrame()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            if (r13 == 0) goto L42e
            int r12 = r12 + 1
        L42e:
            int r11 = r11 + 1
            goto L41c
        L431:
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r12, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            if (r12 <= 0) goto L471
            java.lang.String r9 = "statusSaving7"
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r9)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r11.<init>()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r11.append(r9)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r11.append(r2)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.String r9 = r11.toString()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r1.setSavingOpeningStatusText(r9, r11)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r9 = r1.frames     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r9 = r9.size()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r11 = 0
        L457:
            if (r11 >= r9) goto L471
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r12 = r1.frames     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Object r12 = r12.get(r11)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.data.FrameData r12 = (org.fortheloss.sticknodes.data.FrameData) r12     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            boolean r13 = r12.isAutoCameraOriginFrame()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            if (r13 == 0) goto L46e
            org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle r12 = r12.getAutoCameraBundle()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r12.getData(r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
        L46e:
            int r11 = r11 + 1
            goto L457
        L471:
            r9 = r18
            r9.writeSessionSaveData(r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int[][] r9 = org.fortheloss.sticknodes.movieclip.MCCache.cachedLibraryIDs     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            int r11 = r9.length     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r12 = 0
            r13 = 0
        L47b:
            if (r12 >= r11) goto L48e
            r14 = r9[r12]     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r14 = r14[r4]     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r15 = r9[r12]     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r15 = r15[r8]     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            if (r14 < 0) goto L48b
            if (r15 < 0) goto L48b
            int r13 = r13 + 1
        L48b:
            int r12 = r12 + 1
            goto L47b
        L48e:
            if (r13 <= 0) goto L4ab
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r13, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r12 = 0
        L494:
            if (r12 >= r11) goto L4ae
            r13 = r9[r12]     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r13 = r13[r4]     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r14 = r9[r12]     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r14 = r14[r8]     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            if (r13 < 0) goto L4a8
            if (r14 < 0) goto L4a8
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r13, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r14, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
        L4a8:
            int r12 = r12 + 1
            goto L494
        L4ab:
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r4, r10)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
        L4ae:
            java.lang.String r9 = "statusFinishing"
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r9)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r11.<init>()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r11.append(r9)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r11.append(r2)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.String r2 = r11.toString()     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r1.setSavingOpeningStatusText(r2, r9)     // Catch: java.lang.Throwable -> L4df java.lang.Exception -> L4e3
            r10.close()     // Catch: java.lang.Throwable -> L4cc java.lang.Exception -> L4cf
            goto L51a
        L4cc:
            r0 = move-exception
            r2 = r0
            throw r2
        L4cf:
            com.badlogic.gdx.Files r2 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r2 = r2.absolute(r6)
            boolean r8 = r2.exists()
            if (r8 == 0) goto L519
        L4db:
            r2.delete()
            goto L519
        L4df:
            r0 = move-exception
            r2 = r0
            goto L61a
        L4e3:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L4df
            if (r10 == 0) goto L519
            r10.close()     // Catch: java.lang.Throwable -> L4fa java.lang.Exception -> L50c
            com.badlogic.gdx.Files r2 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r2 = r2.absolute(r6)
            boolean r8 = r2.exists()
            if (r8 == 0) goto L519
        L4f9:
            goto L4db
        L4fa:
            r0 = move-exception
            r2 = r0
            com.badlogic.gdx.Files r3 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r3 = r3.absolute(r6)
            boolean r4 = r3.exists()
            if (r4 == 0) goto L50b
            r3.delete()
        L50b:
            throw r2
        L50c:
            com.badlogic.gdx.Files r2 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r2 = r2.absolute(r6)
            boolean r8 = r2.exists()
            if (r8 == 0) goto L519
            goto L4f9
        L519:
            r8 = 0
        L51a:
            if (r8 == 0) goto L601
            com.badlogic.gdx.Files r2 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r2 = r2.absolute(r3)
            com.badlogic.gdx.Files r3 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r3 = r3.absolute(r6)
            java.io.File r3 = r3.file()
            java.io.File r6 = r2.file()
            com.badlogic.gdx.Files r9 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r5 = r9.absolute(r5)
            java.io.File r5 = r5.file()
            boolean r9 = r3.exists()
            if (r9 == 0) goto L601
            boolean r9 = r6.exists()
            if (r9 == 0) goto L549
            r6.delete()
        L549:
            java.io.BufferedInputStream r9 = new java.io.BufferedInputStream     // Catch: java.io.FileNotFoundException -> L562
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L562
            r10.<init>(r3)     // Catch: java.io.FileNotFoundException -> L562
            r9.<init>(r10)     // Catch: java.io.FileNotFoundException -> L562
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch: java.io.FileNotFoundException -> L55f
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch: java.io.FileNotFoundException -> L55f
            r10.<init>(r6)     // Catch: java.io.FileNotFoundException -> L55f
            r3.<init>(r10)     // Catch: java.io.FileNotFoundException -> L55f
            r7 = r3
            goto L573
        L55f:
            r0 = move-exception
            r3 = r0
            goto L565
        L562:
            r0 = move-exception
            r3 = r0
            r9 = r7
        L565:
            r3.printStackTrace()
            org.fortheloss.framework.IPlatform r6 = org.fortheloss.sticknodes.App.platform
            r6.logNonFatalException(r3)
            if (r9 == 0) goto L572
            org.jcodec.common.io.IOUtils.closeQuietly(r9)
        L572:
            r8 = 0
        L573:
            if (r8 == 0) goto L601
            org.fortheloss.sticknodes.App.writeNonsenseData(r7)     // Catch: java.io.IOException -> L579
            goto L58e
        L579:
            r0 = move-exception
            r3 = r0
            r3.printStackTrace()
            org.fortheloss.framework.IPlatform r6 = org.fortheloss.sticknodes.App.platform
            r6.logNonFatalException(r3)
            if (r9 == 0) goto L588
            org.jcodec.common.io.IOUtils.closeQuietly(r9)
        L588:
            if (r7 == 0) goto L58d
            org.jcodec.common.io.IOUtils.closeQuietly(r7)
        L58d:
            r8 = 0
        L58e:
            if (r8 == 0) goto L601
            org.jcodec.common.io.IOUtils.copy(r9, r7)     // Catch: java.lang.Throwable -> L59e java.io.IOException -> L5a1
            if (r9 == 0) goto L598
            org.jcodec.common.io.IOUtils.closeQuietly(r9)
        L598:
            if (r7 == 0) goto L5b6
            org.jcodec.common.io.IOUtils.closeQuietly(r7)
            goto L5b6
        L59e:
            r0 = move-exception
            r2 = r0
            goto L5f6
        L5a1:
            r0 = move-exception
            r3 = r0
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L59e
            org.fortheloss.framework.IPlatform r6 = org.fortheloss.sticknodes.App.platform     // Catch: java.lang.Throwable -> L59e
            r6.logNonFatalException(r3)     // Catch: java.lang.Throwable -> L59e
            if (r9 == 0) goto L5b0
            org.jcodec.common.io.IOUtils.closeQuietly(r9)
        L5b0:
            if (r7 == 0) goto L5b5
            org.jcodec.common.io.IOUtils.closeQuietly(r7)
        L5b5:
            r8 = 0
        L5b6:
            if (r8 == 0) goto L601
            boolean r3 = r5.exists()
            if (r3 == 0) goto L5c1
            r5.delete()
        L5c1:
            org.fortheloss.framework.IPlatform r3 = org.fortheloss.sticknodes.App.platform
            boolean r3 = r3.isChromebook()
            if (r3 != 0) goto L5d5
            com.badlogic.gdx.Files r3 = com.badlogic.gdx.Gdx.files
            java.lang.String r5 = org.fortheloss.sticknodes.App.projectsPath
            com.badlogic.gdx.files.FileHandle r3 = r3.absolute(r5)
            r2.moveTo(r3)
            goto L601
        L5d5:
            com.badlogic.gdx.Files r3 = com.badlogic.gdx.Gdx.files     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L5e3
            java.lang.String r5 = r5.getAbsolutePath()     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L5e3
            com.badlogic.gdx.files.FileHandle r3 = r3.absolute(r5)     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L5e3
            r2.moveTo(r3)     // Catch: com.badlogic.gdx.utils.GdxRuntimeException -> L5e3
            goto L601
        L5e3:
            org.fortheloss.framework.IPlatform r3 = org.fortheloss.sticknodes.App.platform
            java.lang.String r5 = "chromebook_failed_new_saving_method"
            r3.analyticsSendSingle(r5)
            com.badlogic.gdx.Files r3 = com.badlogic.gdx.Gdx.files
            java.lang.String r5 = org.fortheloss.sticknodes.App.projectsPath
            com.badlogic.gdx.files.FileHandle r3 = r3.absolute(r5)
            r2.moveTo(r3)
            goto L601
        L5f6:
            if (r9 == 0) goto L5fb
            org.jcodec.common.io.IOUtils.closeQuietly(r9)
        L5fb:
            if (r7 == 0) goto L600
            org.jcodec.common.io.IOUtils.closeQuietly(r7)
        L600:
            throw r2
        L601:
            com.badlogic.gdx.Files r2 = com.badlogic.gdx.Gdx.files
            java.lang.String r3 = org.fortheloss.sticknodes.App.tempPath
            com.badlogic.gdx.files.FileHandle r2 = r2.absolute(r3)
            boolean r3 = r2.exists()
            if (r3 == 0) goto L612
            r2.emptyDirectory()
        L612:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r3 = ""
            r1.setSavingOpeningStatusText(r3, r2)
            return r8
        L61a:
            if (r10 == 0) goto L64e
            r10.close()     // Catch: java.lang.Throwable -> L62f java.lang.Exception -> L641
            com.badlogic.gdx.Files r3 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r3 = r3.absolute(r6)
            boolean r4 = r3.exists()
            if (r4 == 0) goto L64e
        L62b:
            r3.delete()
            goto L64e
        L62f:
            r0 = move-exception
            r2 = r0
            com.badlogic.gdx.Files r3 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r3 = r3.absolute(r6)
            boolean r4 = r3.exists()
            if (r4 == 0) goto L640
            r3.delete()
        L640:
            throw r2
        L641:
            com.badlogic.gdx.Files r3 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r3 = r3.absolute(r6)
            boolean r4 = r3.exists()
            if (r4 == 0) goto L64e
            goto L62b
        L64e:
            throw r2
    }
}
