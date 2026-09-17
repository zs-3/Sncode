package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class EditListBox extends org.jcodec.containers.mp4.boxes.FullBox {
    private java.util.List<org.jcodec.containers.mp4.boxes.Edit> edits;

    public EditListBox(org.jcodec.containers.mp4.boxes.Header r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static org.jcodec.containers.mp4.boxes.EditListBox createEditListBox(java.util.List<org.jcodec.containers.mp4.boxes.Edit> r3) {
            org.jcodec.containers.mp4.boxes.EditListBox r0 = new org.jcodec.containers.mp4.boxes.EditListBox
            org.jcodec.containers.mp4.boxes.Header r1 = new org.jcodec.containers.mp4.boxes.Header
            java.lang.String r2 = fourcc()
            r1.<init>(r2)
            r0.<init>(r1)
            r0.edits = r3
            return r0
    }

    public static java.lang.String fourcc() {
            java.lang.String r0 = "elst"
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    protected void doWrite(java.nio.ByteBuffer r5) {
            r4 = this;
            super.doWrite(r5)
            java.util.List<org.jcodec.containers.mp4.boxes.Edit> r0 = r4.edits
            int r0 = r0.size()
            r5.putInt(r0)
            java.util.List<org.jcodec.containers.mp4.boxes.Edit> r0 = r4.edits
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r0.next()
            org.jcodec.containers.mp4.boxes.Edit r1 = (org.jcodec.containers.mp4.boxes.Edit) r1
            long r2 = r1.getDuration()
            int r3 = (int) r2
            r5.putInt(r3)
            long r2 = r1.getMediaTime()
            int r3 = (int) r2
            r5.putInt(r3)
            float r1 = r1.getRate()
            r2 = 1199570944(0x47800000, float:65536.0)
            float r1 = r1 * r2
            int r1 = (int) r1
            r5.putInt(r1)
            goto L12
        L3b:
            return
    }

    public java.util.List<org.jcodec.containers.mp4.boxes.Edit> getEdits() {
            r1 = this;
            java.util.List<org.jcodec.containers.mp4.boxes.Edit> r0 = r1.edits
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r14) {
            r13 = this;
            super.parse(r14)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r13.edits = r0
            int r0 = r14.getInt()
            long r0 = (long) r0
            r2 = 0
        L10:
            long r3 = (long) r2
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 >= 0) goto L36
            int r3 = r14.getInt()
            int r4 = r14.getInt()
            int r5 = r14.getInt()
            float r5 = (float) r5
            r6 = 1199570944(0x47800000, float:65536.0)
            float r12 = r5 / r6
            java.util.List<org.jcodec.containers.mp4.boxes.Edit> r5 = r13.edits
            org.jcodec.containers.mp4.boxes.Edit r6 = new org.jcodec.containers.mp4.boxes.Edit
            long r8 = (long) r3
            long r10 = (long) r4
            r7 = r6
            r7.<init>(r8, r10, r12)
            r5.add(r6)
            int r2 = r2 + 1
            goto L10
        L36:
            return
    }
}
