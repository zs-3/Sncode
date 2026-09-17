package org.fortheloss.sticknodes.animationscreen;

/* loaded from: classes2.dex */
public class NodeDrawTools implements com.badlogic.gdx.utils.Disposable {
    public static final java.lang.String[] TEXTURE_FILES = null;
    public static final java.lang.String[] TEXTURE_NAMES = null;
    private com.badlogic.gdx.graphics.g2d.Batch mBatchRef;
    private com.badlogic.gdx.graphics.g2d.TextureAtlas mNodeAtlas;
    private int mNodeSize;
    private org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] mRegions;
    private org.fortheloss.sticknodes.SNShapeRenderer mShapeRendererRef;
    private int mType;

    static {
            java.lang.String r0 = "nodeAtlasLegacy"
            java.lang.String r1 = "nodeAtlasModern"
            java.lang.String r2 = "nodeAtlasSolid"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            org.fortheloss.sticknodes.animationscreen.NodeDrawTools.TEXTURE_FILES = r0
            java.lang.String r0 = "Legacy"
            java.lang.String r1 = "Modern"
            java.lang.String r2 = "Solid"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            org.fortheloss.sticknodes.animationscreen.NodeDrawTools.TEXTURE_NAMES = r0
            return
    }

    public NodeDrawTools(org.fortheloss.sticknodes.SNShapeRenderer r2, com.badlogic.gdx.graphics.g2d.Batch r3, int r4) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mType = r0
            r0 = 0
            r1.mNodeSize = r0
            r1.mShapeRendererRef = r2
            r1.mBatchRef = r3
            r1.setType(r4)
            return
    }

    private void createAtlas(java.lang.String r11) {
            r10 = this;
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1063675494(0x3f666666, float:0.9)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto Lc
            java.lang.String r0 = "HD/"
            goto Le
        Lc:
            java.lang.String r0 = "SD/"
        Le:
            com.badlogic.gdx.graphics.g2d.TextureAtlas r1 = new com.badlogic.gdx.graphics.g2d.TextureAtlas
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "node_styles/"
            r2.append(r3)
            r2.append(r0)
            r2.append(r11)
            java.lang.String r11 = ".txt"
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            r1.<init>(r11)
            r10.mNodeAtlas = r1
            r11 = 64
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = new org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[r11]
            r10.mRegions = r11
            r0 = 16
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r2 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            java.lang.String r3 = "solid_inactive"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r1.findRegion(r3)
            r2.<init>(r1)
            r11[r0] = r2
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 17
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r3 = "solid_active"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r3)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 18
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r3 = "solid_selected"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r3)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 19
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r3 = "solid_neighbor"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r3)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 0
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r3 = "node_inactive"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r3)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 1
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "node_active"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 2
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "node_selected"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 3
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "node_neighbor"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 28
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "deco_joined_inactive"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 29
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "deco_joined_active"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 30
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "deco_joined_selected"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 31
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "deco_joined_neighbor"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 52
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "node_connector_inactive"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 53
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "node_connector_active"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 54
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "node_connector_selected"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 55
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "node_connector_neighbor"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 8
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "locked_node_inactive"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 9
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "locked_node_active"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 10
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "locked_node_selected"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 11
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "locked_node_neighbor"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 4
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "main_inactive"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 5
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "main_active"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 6
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "main_selected"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 7
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "main_neighbor"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 12
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "locked_main_inactive"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 13
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "locked_main_active"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 14
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "locked_main_selected"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 15
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "locked_main_neighbor"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 20
            org.fortheloss.sticknodes.animationscreen.drawables.NodeLineDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeLineDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "line_solid_inactive"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 21
            org.fortheloss.sticknodes.animationscreen.drawables.NodeLineDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeLineDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "line_solid_active"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 22
            org.fortheloss.sticknodes.animationscreen.drawables.NodeLineDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeLineDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "line_solid_selected"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 23
            org.fortheloss.sticknodes.animationscreen.drawables.NodeLineDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeLineDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "line_solid_neighbor"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 24
            org.fortheloss.sticknodes.animationscreen.drawables.NodeLineDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeLineDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "line_dashed_inactive"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 25
            org.fortheloss.sticknodes.animationscreen.drawables.NodeLineDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeLineDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "line_dashed_active"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 26
            org.fortheloss.sticknodes.animationscreen.drawables.NodeLineDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeLineDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "line_dashed_selected"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 27
            org.fortheloss.sticknodes.animationscreen.drawables.NodeLineDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeLineDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "line_dashed_neighbor"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 32
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "deco_ss_inactive"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 33
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "deco_ss_active"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 34
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "deco_ss_selected"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 35
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "deco_ss_neighbor"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 36
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "deco_polynode_node_inactive"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 37
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "deco_polynode_node_active"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 38
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "deco_polynode_node_selected"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 39
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "deco_polynode_node_neighbor"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 56
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "deco_connector_parent_node_inactive"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 57
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "deco_connector_parent_node_active"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 58
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "deco_connector_parent_node_selected"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 59
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "deco_connector_parent_node_neighbor"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 40
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "deco_polynode_main_inactive"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 41
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "deco_polynode_main_active"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 42
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "deco_polynode_main_selected"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 43
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "deco_polynode_main_neighbor"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 60
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "deco_connector_parent_main_inactive"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 61
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "deco_connector_parent_main_active"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 62
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "deco_connector_parent_main_selected"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 63
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "deco_connector_parent_main_neighbor"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 44
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "bounds_mc_circle_inactive"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 45
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "bounds_mc_circle_active"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 46
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "bounds_sprite_circle_inactive"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r0 = 47
            org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable r1 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeDrawable
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r10.mNodeAtlas
            java.lang.String r4 = "bounds_sprite_circle_active"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r4)
            r1.<init>(r2)
            r11[r0] = r1
            r11 = 1090519040(0x41000000, float:8.0)
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r11
            int r11 = (int) r0
            com.badlogic.gdx.graphics.g2d.NinePatch r0 = new com.badlogic.gdx.graphics.g2d.NinePatch
            com.badlogic.gdx.graphics.g2d.TextureAtlas r1 = r10.mNodeAtlas
            java.lang.String r2 = "bounds_sprite_square_inactive"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r1.findRegion(r2)
            r4 = r0
            r6 = r11
            r7 = r11
            r8 = r11
            r9 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r1 = r10.mRegions
            r2 = 48
            org.fortheloss.sticknodes.animationscreen.drawables.NodeNinePatchDrawable r4 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeNinePatchDrawable
            r4.<init>(r0)
            r1[r2] = r4
            com.badlogic.gdx.graphics.g2d.NinePatch r0 = new com.badlogic.gdx.graphics.g2d.NinePatch
            com.badlogic.gdx.graphics.g2d.TextureAtlas r1 = r10.mNodeAtlas
            java.lang.String r2 = "bounds_sprite_square_inactive_shadow"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r1.findRegion(r2)
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r1 = r10.mRegions
            r2 = 50
            org.fortheloss.sticknodes.animationscreen.drawables.NodeNinePatchDrawable r4 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeNinePatchDrawable
            r4.<init>(r0)
            r1[r2] = r4
            com.badlogic.gdx.graphics.g2d.NinePatch r0 = new com.badlogic.gdx.graphics.g2d.NinePatch
            com.badlogic.gdx.graphics.g2d.TextureAtlas r1 = r10.mNodeAtlas
            java.lang.String r2 = "bounds_sprite_square_active"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r1.findRegion(r2)
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r1 = r10.mRegions
            r2 = 49
            org.fortheloss.sticknodes.animationscreen.drawables.NodeNinePatchDrawable r4 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeNinePatchDrawable
            r4.<init>(r0)
            r1[r2] = r4
            com.badlogic.gdx.graphics.g2d.NinePatch r0 = new com.badlogic.gdx.graphics.g2d.NinePatch
            com.badlogic.gdx.graphics.g2d.TextureAtlas r1 = r10.mNodeAtlas
            java.lang.String r2 = "bounds_sprite_square_active_shadow"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r1.findRegion(r2)
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r11 = r10.mRegions
            r1 = 51
            org.fortheloss.sticknodes.animationscreen.drawables.NodeNinePatchDrawable r2 = new org.fortheloss.sticknodes.animationscreen.drawables.NodeNinePatchDrawable
            r2.<init>(r0)
            r11[r1] = r2
            com.badlogic.gdx.graphics.g2d.TextureAtlas r11 = r10.mNodeAtlas
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r11.findRegion(r3)
            int r11 = r11.getRegionWidth()
            r10.mNodeSize = r11
            return
    }

    private void disposeAtlas() {
            r1 = this;
            com.badlogic.gdx.graphics.g2d.TextureAtlas r0 = r1.mNodeAtlas
            if (r0 == 0) goto L7
            r0.dispose()
        L7:
            r0 = 0
            r1.mNodeAtlas = r0
            r1.mRegions = r0
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1.mShapeRendererRef = r0
            r1.mBatchRef = r0
            r1.disposeAtlas()
            return
    }

    public com.badlogic.gdx.graphics.g2d.Batch getBatch() {
            r1 = this;
            com.badlogic.gdx.graphics.g2d.Batch r0 = r1.mBatchRef
            return r0
    }

    public org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable getNode(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable[] r0 = r1.mRegions
            r2 = r0[r2]
            return r2
    }

    public org.fortheloss.sticknodes.SNShapeRenderer getShapeRenderer() {
            r1 = this;
            org.fortheloss.sticknodes.SNShapeRenderer r0 = r1.mShapeRendererRef
            return r0
    }

    public int getType() {
            r1 = this;
            int r0 = r1.mType
            return r0
    }

    public void setType(int r2) {
            r1 = this;
            int r0 = r1.mType
            if (r2 != r0) goto L5
            return
        L5:
            r1.mType = r2
            r1.disposeAtlas()
            java.lang.String[] r2 = org.fortheloss.sticknodes.animationscreen.NodeDrawTools.TEXTURE_FILES
            int r0 = r1.mType
            r2 = r2[r0]
            r1.createAtlas(r2)
            return
    }
}
