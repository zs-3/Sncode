package org.fortheloss.sticknodes.animationscreen;

/* loaded from: classes2.dex */
public class FontLoader {
    private final int mDefaultId;
    private java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> mFontBundles;

    public FontLoader(boolean r10) {
            r9 = this;
            r9.<init>()
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto Le
            java.lang.String r0 = "HD/"
            goto L10
        Le:
            java.lang.String r0 = "SD/"
        L10:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r9.mFontBundles = r1
            org.fortheloss.sticknodes.FontBundle r2 = new org.fortheloss.sticknodes.FontBundle
            java.lang.String r3 = "default"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "("
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = ")"
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            java.lang.String r6 = org.fortheloss.sticknodes.App.fntTextfieldBoxDefaultDF
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r7 = 0
            r2.<init>(r4, r6, r7)
            r1.add(r2)
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r1 = r9.mFontBundles
            org.fortheloss.sticknodes.FontBundle r2 = new org.fortheloss.sticknodes.FontBundle
            java.lang.String r4 = org.fortheloss.sticknodes.App.fntTextfieldBoxCoolveticaDF
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r6 = 1
            java.lang.String r8 = "Coolvetica"
            r2.<init>(r8, r4, r6)
            r1.add(r2)
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r1 = r9.mFontBundles
            org.fortheloss.sticknodes.FontBundle r2 = new org.fortheloss.sticknodes.FontBundle
            java.lang.String r4 = org.fortheloss.sticknodes.App.fntTextfieldBoxBeKindToTheEarthDF
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r6 = 2
            java.lang.String r8 = "Be Kind to the Earth"
            r2.<init>(r8, r4, r6)
            r1.add(r2)
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r1 = r9.mFontBundles
            org.fortheloss.sticknodes.FontBundle r2 = new org.fortheloss.sticknodes.FontBundle
            java.lang.String r4 = org.fortheloss.sticknodes.App.fntTextfieldBoxEnchantedLandDF
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r6 = 3
            java.lang.String r8 = "Enchanted Land"
            r2.<init>(r8, r4, r6)
            r1.add(r2)
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r1 = r9.mFontBundles
            org.fortheloss.sticknodes.FontBundle r2 = new org.fortheloss.sticknodes.FontBundle
            java.lang.String r4 = org.fortheloss.sticknodes.App.fntTextfieldBoxCaptureItDF
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r6 = 4
            java.lang.String r8 = "Capture It"
            r2.<init>(r8, r4, r6)
            r1.add(r2)
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r1 = r9.mFontBundles
            org.fortheloss.sticknodes.FontBundle r2 = new org.fortheloss.sticknodes.FontBundle
            java.lang.String r4 = org.fortheloss.sticknodes.App.fntTextfieldBoxVCROSDMonoDF
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r6 = 5
            java.lang.String r8 = "VCR OSD Mono"
            r2.<init>(r8, r4, r6)
            r1.add(r2)
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r1 = r9.mFontBundles
            org.fortheloss.sticknodes.FontBundle r2 = new org.fortheloss.sticknodes.FontBundle
            java.lang.String r4 = org.fortheloss.sticknodes.App.fntTextfieldBoxAsianDF
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r6 = 6
            java.lang.String r8 = "Asian"
            r2.<init>(r8, r4, r6)
            r1.add(r2)
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r1 = r9.mFontBundles
            org.fortheloss.sticknodes.FontBundle r2 = new org.fortheloss.sticknodes.FontBundle
            java.lang.String r4 = org.fortheloss.sticknodes.App.fntTextfieldBoxMoonRunesDF
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r6 = 7
            java.lang.String r8 = "Moon Runes"
            r2.<init>(r8, r4, r6)
            r1.add(r2)
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r1 = r9.mFontBundles
            org.fortheloss.sticknodes.FontBundle r2 = new org.fortheloss.sticknodes.FontBundle
            java.lang.String r4 = org.fortheloss.sticknodes.App.fntTextfieldBoxYolksEmoticonsDF
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r6 = 8
            java.lang.String r8 = "Yolks Emoticons"
            r2.<init>(r8, r4, r6)
            r1.add(r2)
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r1 = r9.mFontBundles
            org.fortheloss.sticknodes.FontBundle r2 = new org.fortheloss.sticknodes.FontBundle
            java.lang.String r4 = org.fortheloss.sticknodes.App.fntTextfieldBoxAndyBoldDF
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r6 = 9
            java.lang.String r8 = "Andy Bold"
            r2.<init>(r8, r4, r6)
            r1.add(r2)
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r1 = r9.mFontBundles
            org.fortheloss.sticknodes.FontBundle r2 = new org.fortheloss.sticknodes.FontBundle
            java.lang.String r4 = org.fortheloss.sticknodes.App.fntTextfieldBoxDigitalPlayDF
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r6 = 10
            java.lang.String r8 = "Digital Play"
            r2.<init>(r8, r4, r6)
            r1.add(r2)
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r1 = r9.mFontBundles
            org.fortheloss.sticknodes.FontBundle r2 = new org.fortheloss.sticknodes.FontBundle
            java.lang.String r4 = org.fortheloss.sticknodes.App.fntTextfieldBoxParametricGlitchDF
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r6 = 11
            java.lang.String r8 = "Parametric Glitch"
            r2.<init>(r8, r4, r6)
            r1.add(r2)
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r1 = r9.mFontBundles
            org.fortheloss.sticknodes.FontBundle r2 = new org.fortheloss.sticknodes.FontBundle
            java.lang.String r4 = org.fortheloss.sticknodes.App.fntTextfieldBoxPusabDF
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r6 = 12
            java.lang.String r8 = "Pusaba"
            r2.<init>(r8, r4, r6)
            r1.add(r2)
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r1 = r9.mFontBundles
            org.fortheloss.sticknodes.FontBundle r2 = new org.fortheloss.sticknodes.FontBundle
            java.lang.String r4 = org.fortheloss.sticknodes.App.fntTextfieldBoxSugarAndVinegarDF
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r6 = 13
            java.lang.String r8 = "Sugar and Vinegar"
            r2.<init>(r8, r4, r6)
            r1.add(r2)
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r1 = r9.mFontBundles
            org.fortheloss.sticknodes.FontBundle r2 = new org.fortheloss.sticknodes.FontBundle
            java.lang.String r4 = org.fortheloss.sticknodes.App.fntTextfieldBoxTypoRoundDF
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r6 = 14
            java.lang.String r8 = "Typo Round"
            r2.<init>(r8, r4, r6)
            r1.add(r2)
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r1 = r9.mFontBundles
            org.fortheloss.sticknodes.FontBundle r2 = new org.fortheloss.sticknodes.FontBundle
            java.lang.String r4 = "international"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r4)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            java.lang.String r4 = org.fortheloss.sticknodes.App.fntTextfieldBoxInternationalDF
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r5 = 15
            r2.<init>(r3, r4, r5)
            r1.add(r2)
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r1 = r9.mFontBundles
            org.fortheloss.sticknodes.FontBundle r2 = new org.fortheloss.sticknodes.FontBundle
            java.lang.String r3 = org.fortheloss.sticknodes.App.fntTextfieldBoxDeterminationDF
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r4 = 16
            java.lang.String r6 = "Determination"
            r2.<init>(r6, r3, r4)
            r1.add(r2)
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r1 = r9.mFontBundles
            org.fortheloss.sticknodes.FontBundle r2 = new org.fortheloss.sticknodes.FontBundle
            java.lang.String r3 = org.fortheloss.sticknodes.App.fntTextfieldBoxComicSansDF
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r4 = 17
            java.lang.String r6 = "Comic Sans"
            r2.<init>(r6, r3, r4)
            r1.add(r2)
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r1 = r9.mFontBundles
            org.fortheloss.sticknodes.FontBundle r2 = new org.fortheloss.sticknodes.FontBundle
            java.lang.String r3 = org.fortheloss.sticknodes.App.fntTextfieldBoxImpactDF
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            r3 = 18
            java.lang.String r4 = "Impact"
            r2.<init>(r4, r0, r3)
            r1.add(r2)
            if (r10 == 0) goto L28e
            r7 = 15
        L28e:
            r9.mDefaultId = r7
            r9.loadFont(r7)
            return
    }

    public void dispose() {
            r2 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r0 = r2.mFontBundles
            if (r0 == 0) goto L1a
            int r0 = r0.size()
            int r0 = r0 + (-1)
        La:
            if (r0 < 0) goto L1a
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r1 = r2.mFontBundles
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.FontBundle r1 = (org.fortheloss.sticknodes.FontBundle) r1
            r1.dispose()
            int r0 = r0 + (-1)
            goto La
        L1a:
            r0 = 0
            r2.mFontBundles = r0
            return
    }

    public int getDefaultFontId() {
            r1 = this;
            int r0 = r1.mDefaultId
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle getDefaultFontLabelStyle() {
            r1 = this;
            int r0 = r1.mDefaultId
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = r1.getFontLabelStyle(r0)
            return r0
    }

    public int getFontCount() {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r0 = r1.mFontBundles
            int r0 = r0.size()
            return r0
    }

    public int getFontID(java.lang.String r4) {
            r3 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r0 = r3.mFontBundles
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L2b
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r2 = r3.mFontBundles
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.FontBundle r2 = (org.fortheloss.sticknodes.FontBundle) r2
            java.lang.String r2 = r2.getName()
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L28
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r4 = r3.mFontBundles
            java.lang.Object r4 = r4.get(r1)
            org.fortheloss.sticknodes.FontBundle r4 = (org.fortheloss.sticknodes.FontBundle) r4
            int r4 = r4.getId()
            goto L2c
        L28:
            int r1 = r1 + 1
            goto L7
        L2b:
            r4 = -1
        L2c:
            return r4
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle getFontLabelStyle(int r2) {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r0 = r1.mFontBundles
            java.lang.Object r0 = r0.get(r2)
            org.fortheloss.sticknodes.FontBundle r0 = (org.fortheloss.sticknodes.FontBundle) r0
            boolean r0 = r0.isLoaded()
            if (r0 == 0) goto L15
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r0 = r1.mFontBundles
            java.lang.Object r2 = r0.get(r2)
            goto L1d
        L15:
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r2 = r1.mFontBundles
            int r0 = r1.mDefaultId
            java.lang.Object r2 = r2.get(r0)
        L1d:
            org.fortheloss.sticknodes.FontBundle r2 = (org.fortheloss.sticknodes.FontBundle) r2
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = r2.getLabelStyle()
            return r2
    }

    public int getFontLoadedCount() {
            r3 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r0 = r3.mFontBundles
            int r0 = r0.size()
            int r0 = r0 + (-1)
            r1 = 0
        L9:
            if (r0 < 0) goto L1e
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r2 = r3.mFontBundles
            java.lang.Object r2 = r2.get(r0)
            org.fortheloss.sticknodes.FontBundle r2 = (org.fortheloss.sticknodes.FontBundle) r2
            boolean r2 = r2.isLoaded()
            if (r2 == 0) goto L1b
            int r1 = r1 + 1
        L1b:
            int r0 = r0 + (-1)
            goto L9
        L1e:
            return r1
    }

    public boolean[] getFontLoadedStatus() {
            r4 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r0 = r4.mFontBundles
            int r0 = r0.size()
            boolean[] r1 = new boolean[r0]
            r2 = 0
        L9:
            if (r2 >= r0) goto L1c
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r3 = r4.mFontBundles
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.FontBundle r3 = (org.fortheloss.sticknodes.FontBundle) r3
            boolean r3 = r3.isLoaded()
            r1[r2] = r3
            int r2 = r2 + 1
            goto L9
        L1c:
            return r1
    }

    public java.lang.String getFontName(int r2) {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r0 = r1.mFontBundles
            java.lang.Object r2 = r0.get(r2)
            org.fortheloss.sticknodes.FontBundle r2 = (org.fortheloss.sticknodes.FontBundle) r2
            java.lang.String r2 = r2.getName()
            return r2
    }

    public java.lang.String[] getFontNames() {
            r4 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r0 = r4.mFontBundles
            int r0 = r0.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r1 = r4.mFontBundles
            int r1 = r1.size()
            r2 = 0
        Lf:
            if (r2 >= r1) goto L22
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r3 = r4.mFontBundles
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.FontBundle r3 = (org.fortheloss.sticknodes.FontBundle) r3
            java.lang.String r3 = r3.getName()
            r0[r2] = r3
            int r2 = r2 + 1
            goto Lf
        L22:
            return r0
    }

    public boolean isFontLoaded(int r2) {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r0 = r1.mFontBundles
            java.lang.Object r2 = r0.get(r2)
            org.fortheloss.sticknodes.FontBundle r2 = (org.fortheloss.sticknodes.FontBundle) r2
            boolean r2 = r2.isLoaded()
            return r2
    }

    public void loadFont(int r7) {
            r6 = this;
            boolean r0 = org.fortheloss.sticknodes.App.isMainThread()
            if (r0 == 0) goto L21
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r0 = r6.mFontBundles
            java.lang.Object r0 = r0.get(r7)
            org.fortheloss.sticknodes.FontBundle r0 = (org.fortheloss.sticknodes.FontBundle) r0
            boolean r0 = r0.isLoaded()
            if (r0 == 0) goto L15
            return
        L15:
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r0 = r6.mFontBundles
            java.lang.Object r7 = r0.get(r7)
            org.fortheloss.sticknodes.FontBundle r7 = (org.fortheloss.sticknodes.FontBundle) r7
            r7.load()
            return
        L21:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r0 = r0.getId()
            long r2 = org.fortheloss.sticknodes.App.getMainThreadId()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Cannot load or unload fonts from other Threads besides the main UI thread, current/main: "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = " / "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            r7.<init>(r0)
            throw r7
    }

    public void unloadFont(int r7) {
            r6 = this;
            boolean r0 = org.fortheloss.sticknodes.App.isMainThread()
            if (r0 == 0) goto L25
            int r0 = r6.mDefaultId
            if (r7 == r0) goto L24
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r0 = r6.mFontBundles
            java.lang.Object r0 = r0.get(r7)
            org.fortheloss.sticknodes.FontBundle r0 = (org.fortheloss.sticknodes.FontBundle) r0
            boolean r0 = r0.isLoaded()
            if (r0 != 0) goto L19
            goto L24
        L19:
            java.util.ArrayList<org.fortheloss.sticknodes.FontBundle> r0 = r6.mFontBundles
            java.lang.Object r7 = r0.get(r7)
            org.fortheloss.sticknodes.FontBundle r7 = (org.fortheloss.sticknodes.FontBundle) r7
            r7.unload()
        L24:
            return
        L25:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r0 = r0.getId()
            long r2 = org.fortheloss.sticknodes.App.getMainThreadId()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Cannot load or unload fonts from other Threads besides the main UI thread, current/main: "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = " / "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            r7.<init>(r0)
            throw r7
    }
}
