package org.jcodec.common.model;

/* loaded from: classes2.dex */
public enum Unit extends java.lang.Enum<org.jcodec.common.model.Unit> {
    private static final /* synthetic */ org.jcodec.common.model.Unit[] $VALUES = null;
    public static final org.jcodec.common.model.Unit FRAME = null;
    public static final org.jcodec.common.model.Unit SEC = null;

    static {
            org.jcodec.common.model.Unit r0 = new org.jcodec.common.model.Unit
            java.lang.String r1 = "FRAME"
            r2 = 0
            r0.<init>(r1, r2)
            org.jcodec.common.model.Unit.FRAME = r0
            org.jcodec.common.model.Unit r1 = new org.jcodec.common.model.Unit
            java.lang.String r3 = "SEC"
            r4 = 1
            r1.<init>(r3, r4)
            org.jcodec.common.model.Unit.SEC = r1
            r3 = 2
            org.jcodec.common.model.Unit[] r3 = new org.jcodec.common.model.Unit[r3]
            r3[r2] = r0
            r3[r4] = r1
            org.jcodec.common.model.Unit.$VALUES = r3
            return
    }

    Unit(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static org.jcodec.common.model.Unit valueOf(java.lang.String r1) {
            java.lang.Class<org.jcodec.common.model.Unit> r0 = org.jcodec.common.model.Unit.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.jcodec.common.model.Unit r1 = (org.jcodec.common.model.Unit) r1
            return r1
    }

    public static org.jcodec.common.model.Unit[] values() {
            org.jcodec.common.model.Unit[] r0 = org.jcodec.common.model.Unit.$VALUES
            java.lang.Object r0 = r0.clone()
            org.jcodec.common.model.Unit[] r0 = (org.jcodec.common.model.Unit[]) r0
            return r0
    }
}
