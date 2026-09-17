package org.fortheloss.sticknodes.data;

/* loaded from: classes2.dex */
public class SessionSaveData {
    public boolean alwaysShowCurrentFigureNodes;
    public byte frameCameraMode;
    public int frameIndex;
    public float guidelineX;
    public float guidelineY;
    public boolean isShowingGuides;
    public boolean isShowingNeighborNodes;
    public boolean isShowingNeighborNodesCreative;
    public boolean isShowingOutline;
    public boolean isShowingOutlineCreative;
    public boolean isShowingStageBox;
    public boolean neighborNodesAreAffectedByJoins;
    public boolean onionSkinIsNormal;
    public boolean onlyDrawMainNodes;
    public boolean projectIsFullyOpened;
    public boolean showFigureIDs;
    public boolean showFigureIds;
    public int uvQuality;
    public int version;
    public float zoom;
    public float zoomPositionX;
    public float zoomPositionY;

    public SessionSaveData() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.version = r0
            r2.frameIndex = r0
            r1 = 0
            r2.guidelineX = r1
            r2.guidelineY = r1
            r2.zoom = r1
            r2.zoomPositionX = r1
            r2.zoomPositionY = r1
            r2.uvQuality = r0
            r2.onlyDrawMainNodes = r0
            r2.showFigureIDs = r0
            r1 = 1
            r2.onionSkinIsNormal = r1
            r2.isShowingOutline = r0
            r2.isShowingOutlineCreative = r0
            r2.isShowingNeighborNodes = r0
            r2.isShowingNeighborNodesCreative = r0
            r2.isShowingGuides = r0
            r2.frameCameraMode = r0
            r2.isShowingStageBox = r1
            r2.neighborNodesAreAffectedByJoins = r1
            r2.alwaysShowCurrentFigureNodes = r1
            r2.showFigureIds = r0
            r2.projectIsFullyOpened = r1
            return
    }

    public void readData(int r5, int r6, java.io.DataInputStream r7) throws java.io.IOException {
            r4 = this;
            r4.version = r5
            r0 = 251(0xfb, float:3.52E-43)
            if (r5 >= r0) goto L7
            return
        L7:
            int r0 = r7.readInt()
            r4.frameIndex = r0
            float r0 = r7.readFloat()
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r1
            r4.guidelineX = r0
            float r0 = r7.readFloat()
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r1
            r4.guidelineY = r0
            float r0 = r7.readFloat()
            r4.zoom = r0
            float r0 = r7.readFloat()
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r1
            r4.zoomPositionX = r0
            float r0 = r7.readFloat()
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r1
            r4.zoomPositionY = r0
            int r0 = r7.readInt()
            r4.uvQuality = r0
            r0 = 300(0x12c, float:4.2E-43)
            r1 = 1
            r2 = 0
            if (r5 < r0) goto L4f
            int r3 = r7.read()
            if (r3 == 0) goto L4f
            r3 = 1
            goto L50
        L4f:
            r3 = 0
        L50:
            r4.onlyDrawMainNodes = r3
            if (r5 < r0) goto L5c
            int r3 = r7.read()
            if (r3 == 0) goto L5c
            r3 = 1
            goto L5d
        L5c:
            r3 = 0
        L5d:
            r4.showFigureIDs = r3
            int r3 = r7.read()
            if (r3 == 0) goto L67
            r3 = 1
            goto L68
        L67:
            r3 = 0
        L68:
            r4.onionSkinIsNormal = r3
            int r3 = r7.read()
            if (r3 == 0) goto L72
            r3 = 1
            goto L73
        L72:
            r3 = 0
        L73:
            r4.isShowingOutline = r3
            if (r5 < r0) goto L80
            int r0 = r7.read()
            if (r0 == 0) goto L7e
            goto L80
        L7e:
            r0 = 0
            goto L81
        L80:
            r0 = 1
        L81:
            r4.isShowingOutlineCreative = r0
            r0 = 310(0x136, float:4.34E-43)
            if (r5 < r0) goto L90
            int r3 = r7.read()
            if (r3 == 0) goto L8e
            goto L90
        L8e:
            r3 = 0
            goto L91
        L90:
            r3 = 1
        L91:
            r4.isShowingNeighborNodes = r3
            if (r5 < r0) goto L9e
            int r5 = r7.read()
            if (r5 == 0) goto L9c
            goto L9e
        L9c:
            r5 = 0
            goto L9f
        L9e:
            r5 = 1
        L9f:
            r4.isShowingNeighborNodesCreative = r5
            int r5 = r7.read()
            if (r5 == 0) goto La9
            r5 = 1
            goto Laa
        La9:
            r5 = 0
        Laa:
            r4.isShowingGuides = r5
            r5 = 84
            if (r6 < r5) goto Ldb
            int r0 = r7.read()
            if (r0 == 0) goto Lb8
            r0 = 1
            goto Lb9
        Lb8:
            r0 = 0
        Lb9:
            r4.isShowingStageBox = r0
            int r0 = r7.read()
            if (r0 == 0) goto Lc3
            r0 = 1
            goto Lc4
        Lc3:
            r0 = 0
        Lc4:
            r4.neighborNodesAreAffectedByJoins = r0
            int r0 = r7.read()
            if (r0 == 0) goto Lce
            r0 = 1
            goto Lcf
        Lce:
            r0 = 0
        Lcf:
            r4.alwaysShowCurrentFigureNodes = r0
            int r0 = r7.read()
            if (r0 == 0) goto Ld8
            goto Ld9
        Ld8:
            r1 = 0
        Ld9:
            r4.showFigureIds = r1
        Ldb:
            r0 = 79
            if (r6 < r0) goto Le3
            byte r2 = r7.readByte()
        Le3:
            r4.frameCameraMode = r2
            if (r6 < r5) goto L19a
            int r5 = r7.readInt()
            com.badlogic.gdx.graphics.Color r6 = org.fortheloss.framework.ColorPicker.recentColor1
            r0 = r5 & 255(0xff, float:3.57E-43)
            float r0 = (float) r0
            r1 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 / r1
            int r2 = r5 >> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            float r2 = (float) r2
            float r2 = r2 / r1
            int r5 = r5 >> 16
            r5 = r5 & 255(0xff, float:3.57E-43)
            float r5 = (float) r5
            float r5 = r5 / r1
            r3 = 1065353216(0x3f800000, float:1.0)
            r6.set(r0, r2, r5, r3)
            int r5 = r7.readInt()
            com.badlogic.gdx.graphics.Color r6 = org.fortheloss.framework.ColorPicker.recentColor2
            r0 = r5 & 255(0xff, float:3.57E-43)
            float r0 = (float) r0
            float r0 = r0 / r1
            int r2 = r5 >> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            float r2 = (float) r2
            float r2 = r2 / r1
            int r5 = r5 >> 16
            r5 = r5 & 255(0xff, float:3.57E-43)
            float r5 = (float) r5
            float r5 = r5 / r1
            r6.set(r0, r2, r5, r3)
            int r5 = r7.readInt()
            com.badlogic.gdx.graphics.Color r6 = org.fortheloss.framework.ColorPicker.recentColor3
            r0 = r5 & 255(0xff, float:3.57E-43)
            float r0 = (float) r0
            float r0 = r0 / r1
            int r2 = r5 >> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            float r2 = (float) r2
            float r2 = r2 / r1
            int r5 = r5 >> 16
            r5 = r5 & 255(0xff, float:3.57E-43)
            float r5 = (float) r5
            float r5 = r5 / r1
            r6.set(r0, r2, r5, r3)
            int r5 = r7.readInt()
            com.badlogic.gdx.graphics.Color r6 = org.fortheloss.framework.ColorPicker.recentColor4
            r0 = r5 & 255(0xff, float:3.57E-43)
            float r0 = (float) r0
            float r0 = r0 / r1
            int r2 = r5 >> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            float r2 = (float) r2
            float r2 = r2 / r1
            int r5 = r5 >> 16
            r5 = r5 & 255(0xff, float:3.57E-43)
            float r5 = (float) r5
            float r5 = r5 / r1
            r6.set(r0, r2, r5, r3)
            int r5 = r7.readInt()
            com.badlogic.gdx.graphics.Color r6 = org.fortheloss.framework.ColorPicker.recentColor5
            r0 = r5 & 255(0xff, float:3.57E-43)
            float r0 = (float) r0
            float r0 = r0 / r1
            int r2 = r5 >> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            float r2 = (float) r2
            float r2 = r2 / r1
            int r5 = r5 >> 16
            r5 = r5 & 255(0xff, float:3.57E-43)
            float r5 = (float) r5
            float r5 = r5 / r1
            r6.set(r0, r2, r5, r3)
            int r5 = r7.readInt()
            com.badlogic.gdx.graphics.Color r6 = org.fortheloss.framework.ColorPicker.recentColor6
            r0 = r5 & 255(0xff, float:3.57E-43)
            float r0 = (float) r0
            float r0 = r0 / r1
            int r2 = r5 >> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            float r2 = (float) r2
            float r2 = r2 / r1
            int r5 = r5 >> 16
            r5 = r5 & 255(0xff, float:3.57E-43)
            float r5 = (float) r5
            float r5 = r5 / r1
            r6.set(r0, r2, r5, r3)
            int r5 = r7.readInt()
            com.badlogic.gdx.graphics.Color r6 = org.fortheloss.framework.ColorPicker.recentColor7
            r7 = r5 & 255(0xff, float:3.57E-43)
            float r7 = (float) r7
            float r7 = r7 / r1
            int r0 = r5 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r0 = (float) r0
            float r0 = r0 / r1
            int r5 = r5 >> 16
            r5 = r5 & 255(0xff, float:3.57E-43)
            float r5 = (float) r5
            float r5 = r5 / r1
            r6.set(r7, r0, r5, r3)
        L19a:
            return
    }
}
