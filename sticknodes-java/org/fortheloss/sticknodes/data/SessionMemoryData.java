package org.fortheloss.sticknodes.data;

/* loaded from: classes2.dex */
public class SessionMemoryData {
    private int mCounter;
    public int maxMemoryMB;
    public int memoryMB;
    public int numFonts;
    public int numFrames;
    public int numMovieclips;
    public long numNodesInMovieclipFrames;
    public long numNodesInProjectFrames;
    public int numSounds;
    public long numSpritePixels;
    public int numSprites;
    public int numSpritesWithDataInMemory;
    public int numStickfigures;
    public long soundsMB;

    public SessionMemoryData() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.mCounter = r0
            r3.memoryMB = r0
            r3.maxMemoryMB = r0
            r3.numFrames = r0
            r1 = 0
            r3.numNodesInProjectFrames = r1
            r3.numNodesInMovieclipFrames = r1
            r3.numStickfigures = r0
            r3.numMovieclips = r0
            r3.numSprites = r0
            r3.numSounds = r0
            r3.numFonts = r0
            r3.numSpritePixels = r1
            r3.numSpritesWithDataInMemory = r0
            r3.soundsMB = r1
            return
    }

    public void update(org.fortheloss.sticknodes.animationscreen.AnimationScreen r11, boolean r12) {
            r10 = this;
            org.fortheloss.sticknodes.data.ProjectData r11 = r11.getProjectData()
            if (r11 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.FontLoader r0 = r11.getFontLoader()
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r11.frames
            if (r1 != 0) goto L10
            return
        L10:
            int r1 = r10.mCounter
            int r1 = r1 + 1
            r10.mCounter = r1
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            long r1 = r1.getJavaHeap()
            r3 = 1048576(0x100000, double:5.180654E-318)
            long r1 = r1 / r3
            int r2 = (int) r1
            r10.memoryMB = r2
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r1 = r1.getType()
            com.badlogic.gdx.Application$ApplicationType r2 = com.badlogic.gdx.Application.ApplicationType.iOS
            r5 = 0
            if (r1 != r2) goto L30
            r2 = 0
            goto L3a
        L30:
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()
            long r1 = r1.maxMemory()
            long r1 = r1 / r3
            int r2 = (int) r1
        L3a:
            r10.maxMemoryMB = r2
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r11.frames
            int r1 = r1.size()
            r10.numFrames = r1
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r1 = r11.libraryStickfigures
            int r1 = r1.size()
            r10.numStickfigures = r1
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r1 = r11.libraryMovieclips
            int r1 = r1.size()
            r10.numMovieclips = r1
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r1 = r11.librarySprites
            int r1 = r1.size()
            r10.numSprites = r1
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r1 = r11.librarySoundDatas
            int r1 = r1.size()
            r10.numSounds = r1
            if (r0 == 0) goto L6b
            int r0 = r0.getFontLoadedCount()
            goto L6c
        L6b:
            r0 = 0
        L6c:
            r10.numFonts = r0
            r0 = 0
            if (r12 != 0) goto L78
            int r2 = r10.mCounter
            int r2 = r2 % 10
            if (r2 != 0) goto Lb8
        L78:
            java.lang.System.gc()
            r10.numSpritePixels = r0
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r2 = r11.librarySprites
            int r2 = r2.size()
            int r2 = r2 + (-1)
        L85:
            if (r2 < 0) goto Lb8
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r3 = r11.librarySprites
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.sprite.ISpriteSource r3 = (org.fortheloss.sticknodes.sprite.ISpriteSource) r3
            boolean r4 = r3 instanceof org.fortheloss.sticknodes.sprite.SpriteGroupSource
            if (r4 == 0) goto L94
            goto Lb5
        L94:
            org.fortheloss.sticknodes.sprite.SpriteSource r3 = (org.fortheloss.sticknodes.sprite.SpriteSource) r3
            com.badlogic.gdx.graphics.Texture r4 = r3.getTexture()
            if (r4 == 0) goto Lb5
            long r6 = r10.numSpritePixels
            com.badlogic.gdx.graphics.Texture r4 = r3.getTexture()
            int r4 = r4.getWidth()
            long r8 = (long) r4
            com.badlogic.gdx.graphics.Texture r3 = r3.getTexture()
            int r3 = r3.getHeight()
            long r3 = (long) r3
            long r8 = r8 * r3
            long r6 = r6 + r8
            r10.numSpritePixels = r6
        Lb5:
            int r2 = r2 + (-1)
            goto L85
        Lb8:
            if (r12 == 0) goto L181
            r10.numNodesInProjectFrames = r0
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r2 = r11.frames
            int r2 = r2.size()
            int r2 = r2 + (-1)
        Lc4:
            if (r2 < 0) goto Ldb
            long r3 = r10.numNodesInProjectFrames
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r6 = r11.frames
            java.lang.Object r6 = r6.get(r2)
            org.fortheloss.sticknodes.data.IFrameData r6 = (org.fortheloss.sticknodes.data.IFrameData) r6
            int r6 = r6.getFrameTotalNodeCount()
            long r6 = (long) r6
            long r3 = r3 + r6
            r10.numNodesInProjectFrames = r3
            int r2 = r2 + (-1)
            goto Lc4
        Ldb:
            r10.numNodesInMovieclipFrames = r0
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r2 = r11.libraryMovieclips
            int r2 = r2.size()
            int r2 = r2 + (-1)
        Le5:
            if (r2 < 0) goto L111
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r3 = r11.libraryMovieclips
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r3 = (org.fortheloss.sticknodes.movieclip.MCMovieclipSource) r3
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r4 = r3.frames
            int r4 = r4.size()
            int r4 = r4 + (-1)
        Lf7:
            if (r4 < 0) goto L10e
            long r6 = r10.numNodesInMovieclipFrames
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r8 = r3.frames
            java.lang.Object r8 = r8.get(r4)
            org.fortheloss.sticknodes.data.IFrameData r8 = (org.fortheloss.sticknodes.data.IFrameData) r8
            int r8 = r8.getFrameTotalNodeCount()
            long r8 = (long) r8
            long r6 = r6 + r8
            r10.numNodesInMovieclipFrames = r6
            int r4 = r4 + (-1)
            goto Lf7
        L10e:
            int r2 = r2 + (-1)
            goto Le5
        L111:
            r10.numSpritesWithDataInMemory = r5
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r2 = r11.librarySprites
            int r2 = r2.size()
            int r2 = r2 + (-1)
        L11b:
            if (r2 < 0) goto L13b
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r3 = r11.librarySprites
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.sprite.ISpriteSource r3 = (org.fortheloss.sticknodes.sprite.ISpriteSource) r3
            boolean r4 = r3 instanceof org.fortheloss.sticknodes.sprite.SpriteGroupSource
            if (r4 == 0) goto L12a
            goto L138
        L12a:
            org.fortheloss.sticknodes.sprite.SpriteSource r3 = (org.fortheloss.sticknodes.sprite.SpriteSource) r3
            boolean r3 = r3.hasPixmapFile()
            if (r3 != 0) goto L138
            int r3 = r10.numSpritesWithDataInMemory
            int r3 = r3 + 1
            r10.numSpritesWithDataInMemory = r3
        L138:
            int r2 = r2 + (-1)
            goto L11b
        L13b:
            r10.soundsMB = r0
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r0 = r11.librarySoundDatas
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L145:
            if (r0 < 0) goto L17a
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r1 = r11.librarySoundDatas
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.data.SoundData r1 = (org.fortheloss.sticknodes.data.SoundData) r1
            com.badlogic.gdx.Files r2 = com.badlogic.gdx.Gdx.files
            java.lang.String r3 = org.fortheloss.sticknodes.App.soundsPath
            java.lang.String r1 = r1.fileName
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.badlogic.gdx.files.FileHandle r1 = r2.absolute(r1)
            boolean r2 = r1.exists()
            if (r2 == 0) goto L177
            long r2 = r10.soundsMB
            long r4 = r1.length()
            long r2 = r2 + r4
            r10.soundsMB = r2
        L177:
            int r0 = r0 + (-1)
            goto L145
        L17a:
            long r0 = r10.soundsMB
            r2 = 1024(0x400, double:5.06E-321)
            long r0 = r0 / r2
            r10.soundsMB = r0
        L181:
            org.fortheloss.framework.IPlatform r11 = org.fortheloss.sticknodes.App.platform
            int r0 = r10.memoryMB
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "latest_memory_measure"
            r11.setCrashlyticsKeyString(r1, r0)
            org.fortheloss.framework.IPlatform r11 = org.fortheloss.sticknodes.App.platform
            int r0 = r10.numFrames
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "latest_project_frame_count"
            r11.setCrashlyticsKeyString(r1, r0)
            if (r12 == 0) goto L1c4
            org.fortheloss.framework.IPlatform r11 = org.fortheloss.sticknodes.App.platform
            long r0 = r10.numSpritePixels
            java.lang.String r12 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "latest_imported_pixel_count"
            r11.setCrashlyticsKeyString(r0, r12)
            org.fortheloss.framework.IPlatform r11 = org.fortheloss.sticknodes.App.platform
            long r0 = r10.numNodesInProjectFrames
            java.lang.String r12 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "latest_project_node_count"
            r11.setCrashlyticsKeyString(r0, r12)
            org.fortheloss.framework.IPlatform r11 = org.fortheloss.sticknodes.App.platform
            long r0 = r10.numNodesInMovieclipFrames
            java.lang.String r12 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "latest_total_mc_node_count"
            r11.setCrashlyticsKeyString(r0, r12)
        L1c4:
            return
    }
}
