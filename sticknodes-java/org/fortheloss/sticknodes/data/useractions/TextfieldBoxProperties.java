package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class TextfieldBoxProperties implements com.badlogic.gdx.utils.Disposable {
    public int alignment;
    public float alpha;
    public com.badlogic.gdx.graphics.Color color;
    public boolean drawAboveWidescreenBars;
    public int fontID;
    public boolean hasShadow;
    public boolean locked;
    public float rotation;
    public float scale;
    public com.badlogic.gdx.graphics.Color shadowColor;
    public java.lang.String text;
    public float x;
    public float y;

    public TextfieldBoxProperties(org.fortheloss.sticknodes.TextfieldBox r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.fontID = r0
            r1 = 0
            r3.x = r1
            r3.y = r1
            r3.scale = r1
            r3.alignment = r0
            r3.rotation = r1
            r2 = 1065353216(0x3f800000, float:1.0)
            r3.alpha = r2
            r3.drawAboveWidescreenBars = r0
            r3.locked = r0
            r3.hasShadow = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r0.<init>()
            r3.color = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r0.<init>(r1, r1, r1, r2)
            r3.shadowColor = r0
            r3.getProperties(r4)
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1.text = r0
            r1.color = r0
            r1.shadowColor = r0
            return
    }

    public void getProperties(org.fortheloss.sticknodes.TextfieldBox r1) {
            r0 = this;
            r1.getProperties(r0)
            return
    }
}
