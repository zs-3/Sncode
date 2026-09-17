package org.fortheloss.sticknodes.animationscreen.spritemenus;

/* loaded from: classes2.dex */
public class SpriteImporterTool implements com.badlogic.gdx.utils.Disposable {
    private boolean mAllowSpriteGroups;
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen mAnimationScreenRef;
    private com.badlogic.gdx.graphics.Pixmap[] mCirclePixmaps;
    private boolean mIsPrepared;
    private java.util.HashMap<java.lang.String, java.lang.Integer> mLastBatchNameToLibIdMap;
    private com.badlogic.gdx.graphics.Texture[] mMaskTextures;
    private java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> mPreparedSelections;
    private java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool.SpritePixmapData> mPreparedSpritePixmapDatas;



    private static class SpritePixmapData implements com.badlogic.gdx.utils.Disposable {
        public float internalScaleX;
        public float internalScaleY;
        public boolean isAA;
        public boolean isMasked;
        public boolean isTransparent;
        public java.lang.String name;
        public float originX;
        public float originY;
        public com.badlogic.gdx.graphics.Pixmap pixmap;

        private SpritePixmapData() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ SpritePixmapData(org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool.SpritePixmapDataIA r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.badlogic.gdx.utils.Disposable
        public void dispose() {
                r1 = this;
                r0 = 0
                r1.pixmap = r0
                r1.name = r0
                return
        }
    }

    /* compiled from: R8$$SyntheticClass */
    /* renamed from: org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool$SpritePixmapData-IA, reason: invalid class name */
    public final /* synthetic */ class SpritePixmapDataIA {
    }

    /* renamed from: -$$Nest$fgetmCirclePixmaps, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.graphics.Pixmap[] m1265$$Nest$fgetmCirclePixmaps(org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool r0) {
            com.badlogic.gdx.graphics.Pixmap[] r0 = r0.mCirclePixmaps
            return r0
    }

    /* renamed from: -$$Nest$fgetmPreparedSelections, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.util.ArrayList m1266$$Nest$fgetmPreparedSelections(org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool r0) {
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r0 = r0.mPreparedSelections
            return r0
    }

    /* renamed from: -$$Nest$fgetmPreparedSpritePixmapDatas, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.util.ArrayList m1267$$Nest$fgetmPreparedSpritePixmapDatas(org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool r0) {
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool$SpritePixmapData> r0 = r0.mPreparedSpritePixmapDatas
            return r0
    }

    /* renamed from: -$$Nest$fputmIsPrepared, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1268$$Nest$fputmIsPrepared(org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool r0, boolean r1) {
            r0.mIsPrepared = r1
            return
    }

    /* renamed from: -$$Nest$mcreateTexturesFromPixmapsAndImport, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1269$$Nest$mcreateTexturesFromPixmapsAndImport(org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool r0) {
            r0.createTexturesFromPixmapsAndImport()
            return
    }

    public SpriteImporterTool(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mIsPrepared = r0
            r1.mAnimationScreenRef = r2
            r1.initMasks()
            return
    }

    private java.lang.String appendNumberToName(java.lang.String r7, java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r8) {
            r6 = this;
            r0 = 0
            r1 = 1
            r3 = r7
            r2 = 0
            r4 = 1
        L5:
            if (r2 != 0) goto L42
            int r2 = r8.size()
            int r2 = r2 - r1
        Lc:
            if (r2 < 0) goto L3f
            java.lang.Object r5 = r8.get(r2)
            org.fortheloss.sticknodes.sprite.ISpriteSource r5 = (org.fortheloss.sticknodes.sprite.ISpriteSource) r5
            java.lang.String r5 = r5.getName()
            boolean r5 = r3.equalsIgnoreCase(r5)
            if (r5 == 0) goto L3c
            int r2 = r4 + 1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            java.lang.String r5 = " ("
            r3.append(r5)
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = r2
            r2 = 1
            goto L40
        L3c:
            int r2 = r2 + (-1)
            goto Lc
        L3f:
            r2 = 0
        L40:
            r2 = r2 ^ r1
            goto L5
        L42:
            return r3
    }

    private void createTexturesFromPixmapsAndImport() {
            r18 = this;
            r0 = r18
            boolean r1 = r0.mIsPrepared
            if (r1 != 0) goto L7
            return
        L7:
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool$SpritePixmapData> r2 = r0.mPreparedSpritePixmapDatas
            int r2 = r2.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "SpriteImporterTool.createTexturesFromPixmapsAndImport("
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = ")"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "last_status_event"
            r1.setCrashlyticsKeyString(r3, r2)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.mLastBatchNameToLibIdMap = r1
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool$SpritePixmapData> r1 = r0.mPreparedSpritePixmapDatas
            int r1 = r1.size()
            r2 = 0
            r3 = 0
        L39:
            java.lang.String r4 = "_"
            r5 = 1
            if (r3 >= r1) goto Lc5
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool$SpritePixmapData> r6 = r0.mPreparedSpritePixmapDatas
            java.lang.Object r6 = r6.get(r3)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool$SpritePixmapData r6 = (org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool.SpritePixmapData) r6
            org.fortheloss.framework.IPlatform r7 = org.fortheloss.sticknodes.App.platform
            com.badlogic.gdx.graphics.Pixmap r8 = r6.pixmap
            int r8 = r8.getWidth()
            com.badlogic.gdx.graphics.Pixmap r9 = r6.pixmap
            int r9 = r9.getHeight()
            float r10 = r6.internalScaleX
            float r11 = r6.internalScaleY
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "w_h_sX_sY:"
            r12.append(r13)
            r12.append(r8)
            r12.append(r4)
            r12.append(r9)
            r12.append(r4)
            r12.append(r10)
            r12.append(r4)
            r12.append(r11)
            java.lang.String r4 = r12.toString()
            java.lang.String r8 = "about_to_import_sprite"
            r7.setCrashlyticsKeyString(r8, r4)
            org.fortheloss.sticknodes.sprite.SpriteSource r4 = new org.fortheloss.sticknodes.sprite.SpriteSource
            java.lang.String r10 = r6.name
            com.badlogic.gdx.graphics.Pixmap r11 = r6.pixmap
            boolean r7 = r6.isTransparent
            if (r7 != 0) goto L91
            boolean r7 = r6.isMasked
            if (r7 == 0) goto L8f
            goto L91
        L8f:
            r12 = 0
            goto L92
        L91:
            r12 = 1
        L92:
            boolean r13 = r6.isAA
            float r14 = r6.originX
            float r15 = r6.originY
            float r7 = r6.internalScaleX
            float r8 = r6.internalScaleY
            r9 = r4
            r16 = r7
            r17 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r7 = r0.mAnimationScreenRef
            r7.addSpriteToLibrary(r4)
            java.util.HashMap<java.lang.String, java.lang.Integer> r4 = r0.mLastBatchNameToLibIdMap
            java.lang.String r6 = r6.name
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r7 = r0.mAnimationScreenRef
            org.fortheloss.sticknodes.data.ProjectData r7 = r7.getProjectData()
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r7 = r7.librarySprites
            int r7 = r7.size()
            int r7 = r7 - r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r4.put(r6, r5)
            int r3 = r3 + 1
            goto L39
        Lc5:
            boolean r1 = r0.mAllowSpriteGroups
            if (r1 == 0) goto L17e
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r1 = r0.mPreparedSelections
            java.util.HashMap r1 = r0.getSpriteGroupNameMappings(r1)
            java.util.Set r3 = r1.entrySet()
            int r3 = r3.size()
            if (r3 <= 0) goto L17e
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r0.mAnimationScreenRef
            org.fortheloss.sticknodes.data.ProjectData r3 = r3.getProjectData()
            java.util.Set r6 = r1.keySet()
            java.util.Iterator r6 = r6.iterator()
        Le7:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L17e
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r1.get(r7)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            int r9 = r8.size()
            if (r9 > r5) goto L100
            goto Le7
        L100:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            int r10 = r8.size()
            r11 = 0
        L10a:
            if (r11 >= r10) goto L13b
            java.util.HashMap<java.lang.String, java.lang.Integer> r12 = r0.mLastBatchNameToLibIdMap
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r13 = r0.mPreparedSelections
            java.lang.Object r14 = r8.get(r11)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            java.lang.Object r13 = r13.get(r14)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r13 = (org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData) r13
            java.lang.String r13 = r13.name
            java.lang.Object r12 = r12.get(r13)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            org.fortheloss.sticknodes.sprite.ISpriteSource r13 = r3.getLibrarySprite(r12)
            org.fortheloss.sticknodes.sprite.SpriteSource r13 = (org.fortheloss.sticknodes.sprite.SpriteSource) r13
            r3.hideSpriteInImportList(r12, r5)
            r9.add(r13)
            int r11 = r11 + 1
            goto L10a
        L13b:
            java.lang.String r8 = "group"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r7)
            r10.append(r4)
            r10.append(r8)
            java.lang.String r7 = r10.toString()
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r8 = r3.librarySprites
            java.lang.String r7 = r0.appendNumberToName(r7, r8)
            org.fortheloss.sticknodes.sprite.SpriteGroupSource r8 = new org.fortheloss.sticknodes.sprite.SpriteGroupSource
            r8.<init>(r7)
            r8.setStates(r9)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r9 = r0.mAnimationScreenRef
            r9.addSpriteToLibrary(r8)
            java.util.HashMap<java.lang.String, java.lang.Integer> r8 = r0.mLastBatchNameToLibIdMap
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r9 = r0.mAnimationScreenRef
            org.fortheloss.sticknodes.data.ProjectData r9 = r9.getProjectData()
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r9 = r9.librarySprites
            int r9 = r9.size()
            int r9 = r9 - r5
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8.put(r7, r9)
            goto Le7
        L17e:
            r0.mIsPrepared = r2
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool$SpritePixmapData> r1 = r0.mPreparedSpritePixmapDatas
            r2 = 0
            if (r1 == 0) goto L19c
            int r1 = r1.size()
            int r1 = r1 - r5
        L18a:
            if (r1 < 0) goto L19a
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool$SpritePixmapData> r3 = r0.mPreparedSpritePixmapDatas
            java.lang.Object r3 = r3.get(r1)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool$SpritePixmapData r3 = (org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool.SpritePixmapData) r3
            r3.dispose()
            int r1 = r1 + (-1)
            goto L18a
        L19a:
            r0.mPreparedSpritePixmapDatas = r2
        L19c:
            r0.mPreparedSelections = r2
            r18.onFinished()
            return
    }

    private void initMasks() {
            r8 = this;
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto Lb
            java.lang.String r0 = "HD/"
            goto Ld
        Lb:
            java.lang.String r0 = "SD/"
        Ld:
            r1 = 5
            com.badlogic.gdx.graphics.Texture[] r1 = new com.badlogic.gdx.graphics.Texture[r1]
            r8.mMaskTextures = r1
            com.badlogic.gdx.graphics.Texture r2 = new com.badlogic.gdx.graphics.Texture
            com.badlogic.gdx.Files r3 = com.badlogic.gdx.Gdx.files
            java.lang.String r4 = org.fortheloss.sticknodes.App.spriteMask1024Texture
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.badlogic.gdx.files.FileHandle r3 = r3.internal(r4)
            r2.<init>(r3)
            r3 = 0
            r1[r3] = r2
            com.badlogic.gdx.graphics.Texture[] r1 = r8.mMaskTextures
            com.badlogic.gdx.graphics.Texture r2 = new com.badlogic.gdx.graphics.Texture
            com.badlogic.gdx.Files r4 = com.badlogic.gdx.Gdx.files
            java.lang.String r5 = org.fortheloss.sticknodes.App.spriteMask512Texture
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.badlogic.gdx.files.FileHandle r4 = r4.internal(r5)
            r2.<init>(r4)
            r4 = 1
            r1[r4] = r2
            com.badlogic.gdx.graphics.Texture[] r1 = r8.mMaskTextures
            r2 = 2
            com.badlogic.gdx.graphics.Texture r4 = new com.badlogic.gdx.graphics.Texture
            com.badlogic.gdx.Files r5 = com.badlogic.gdx.Gdx.files
            java.lang.String r6 = org.fortheloss.sticknodes.App.spriteMask256Texture
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.badlogic.gdx.files.FileHandle r5 = r5.internal(r6)
            r4.<init>(r5)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Texture[] r1 = r8.mMaskTextures
            r2 = 3
            com.badlogic.gdx.graphics.Texture r4 = new com.badlogic.gdx.graphics.Texture
            com.badlogic.gdx.Files r5 = com.badlogic.gdx.Gdx.files
            java.lang.String r6 = org.fortheloss.sticknodes.App.spriteMask128Texture
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.badlogic.gdx.files.FileHandle r5 = r5.internal(r6)
            r4.<init>(r5)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Texture[] r1 = r8.mMaskTextures
            r2 = 4
            com.badlogic.gdx.graphics.Texture r4 = new com.badlogic.gdx.graphics.Texture
            com.badlogic.gdx.Files r5 = com.badlogic.gdx.Gdx.files
            java.lang.String r6 = org.fortheloss.sticknodes.App.spriteMask64Texture
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            r7.append(r6)
            java.lang.String r0 = r7.toString()
            com.badlogic.gdx.files.FileHandle r0 = r5.internal(r0)
            r4.<init>(r0)
            r1[r2] = r4
            com.badlogic.gdx.graphics.Texture[] r0 = r8.mMaskTextures
            int r0 = r0.length
            com.badlogic.gdx.graphics.Pixmap[] r0 = new com.badlogic.gdx.graphics.Pixmap[r0]
            r8.mCirclePixmaps = r0
            int r0 = r0.length
        Lbd:
            if (r3 >= r0) goto Ldd
            com.badlogic.gdx.graphics.Texture[] r1 = r8.mMaskTextures
            r1 = r1[r3]
            com.badlogic.gdx.graphics.TextureData r1 = r1.getTextureData()
            r1.prepare()
            com.badlogic.gdx.graphics.Pixmap[] r1 = r8.mCirclePixmaps
            com.badlogic.gdx.graphics.Texture[] r2 = r8.mMaskTextures
            r2 = r2[r3]
            com.badlogic.gdx.graphics.TextureData r2 = r2.getTextureData()
            com.badlogic.gdx.graphics.Pixmap r2 = r2.consumePixmap()
            r1[r3] = r2
            int r3 = r3 + 1
            goto Lbd
        Ldd:
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            r0 = 0
            r3.mAnimationScreenRef = r0
            com.badlogic.gdx.graphics.Pixmap[] r1 = r3.mCirclePixmaps
            if (r1 == 0) goto L18
            int r1 = r1.length
            int r1 = r1 + (-1)
        La:
            if (r1 < 0) goto L16
            com.badlogic.gdx.graphics.Pixmap[] r2 = r3.mCirclePixmaps
            r2 = r2[r1]
            r2.dispose()
            int r1 = r1 + (-1)
            goto La
        L16:
            r3.mCirclePixmaps = r0
        L18:
            com.badlogic.gdx.graphics.Texture[] r1 = r3.mMaskTextures
            if (r1 == 0) goto L2d
            int r1 = r1.length
            int r1 = r1 + (-1)
        L1f:
            if (r1 < 0) goto L2b
            com.badlogic.gdx.graphics.Texture[] r2 = r3.mMaskTextures
            r2 = r2[r1]
            r2.dispose()
            int r1 = r1 + (-1)
            goto L1f
        L2b:
            r3.mMaskTextures = r0
        L2d:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool$SpritePixmapData> r1 = r3.mPreparedSpritePixmapDatas
            if (r1 == 0) goto L49
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L37:
            if (r1 < 0) goto L47
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool$SpritePixmapData> r2 = r3.mPreparedSpritePixmapDatas
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool$SpritePixmapData r2 = (org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool.SpritePixmapData) r2
            r2.dispose()
            int r1 = r1 + (-1)
            goto L37
        L47:
            r3.mPreparedSpritePixmapDatas = r0
        L49:
            r3.mPreparedSelections = r0
            r3.mLastBatchNameToLibIdMap = r0
            return
    }

    public java.util.HashMap<java.lang.String, java.lang.Integer> getLastBatchNameToLibIdMap() {
            r1 = this;
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r1.mLastBatchNameToLibIdMap
            return r0
    }

    public com.badlogic.gdx.graphics.Texture[] getMaskTextures() {
            r1 = this;
            com.badlogic.gdx.graphics.Texture[] r0 = r1.mMaskTextures
            return r0
    }

    public java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Integer>> getSpriteGroupNameMappings(java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r10) {
            r9 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r10.size()
            r3 = 0
            r4 = 0
        L10:
            r5 = 95
            if (r4 >= r2) goto L41
            java.lang.Object r6 = r10.get(r4)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r6 = (org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData) r6
            java.lang.String r6 = r6.name
            int r5 = r6.lastIndexOf(r5)
            if (r5 <= 0) goto L3e
            int r5 = r5 + 1
            java.lang.String r5 = r6.substring(r5)
            int r6 = r5.length()
            r7 = 6
            if (r6 > r7) goto L3e
            java.lang.String r6 = "\\d+"
            boolean r5 = r5.matches(r6)
            if (r5 == 0) goto L3e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r1.add(r5)
        L3e:
            int r4 = r4 + 1
            goto L10
        L41:
            int r2 = r1.size()
            r4 = 2
            if (r2 < r4) goto Lb5
            int r2 = r1.size()
            int r2 = r2 + (-1)
        L4e:
            if (r2 < 0) goto L88
            java.lang.Object r6 = r1.get(r2)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r7 = r10.get(r6)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r7 = (org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData) r7
            java.lang.String r7 = r7.name
            int r8 = r7.lastIndexOf(r5)
            java.lang.String r7 = r7.substring(r3, r8)
            boolean r8 = r0.containsKey(r7)
            if (r8 != 0) goto L78
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r0.put(r7, r8)
        L78:
            java.lang.Object r7 = r0.get(r7)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.add(r6)
            int r2 = r2 + (-1)
            goto L4e
        L88:
            java.util.Set r1 = r0.keySet()
            java.util.Iterator r1 = r1.iterator()
        L90:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lb5
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r0.get(r2)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r3 = r2.size()
            if (r3 >= r4) goto Lac
            r1.remove()
            goto L90
        Lac:
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool$2 r3 = new org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool$2
            r3.<init>(r9, r10)
            java.util.Collections.sort(r2, r3)
            goto L90
        Lb5:
            return r0
    }

    public void importSelections(com.badlogic.gdx.graphics.Pixmap r7, boolean r8, boolean r9, com.badlogic.gdx.graphics.Color r10, java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r11, boolean r12) {
            r6 = this;
            boolean r0 = r6.mIsPrepared
            if (r0 == 0) goto L5
            return
        L5:
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            int r1 = r11.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "SpriteImporterTool.importSelections("
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ")"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "last_status_event"
            r0.setCrashlyticsKeyString(r2, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.mPreparedSpritePixmapDatas = r0
            r6.mPreparedSelections = r11
            r6.mAllowSpriteGroups = r12
            r11 = 0
            r6.mLastBatchNameToLibIdMap = r11
            java.lang.Thread r11 = new java.lang.Thread
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool$1 r12 = new org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteImporterTool$1
            r0 = r12
            r1 = r6
            r2 = r9
            r3 = r8
            r4 = r10
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r11.<init>(r12)
            r11.start()
            return
    }

    protected void onFinished() {
            r0 = this;
            r0 = 0
            throw r0
    }
}
