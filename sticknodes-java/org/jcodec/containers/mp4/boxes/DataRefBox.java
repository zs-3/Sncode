package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class DataRefBox extends org.jcodec.containers.mp4.boxes.NodeBox {
    private static final org.jcodec.containers.mp4.boxes.DataRefBox.MyFactory FACTORY = null;

    public static class MyFactory extends org.jcodec.containers.mp4.boxes.BoxFactory {
        private final java.util.Map<java.lang.String, java.lang.Class<? extends org.jcodec.containers.mp4.boxes.Box>> mappings;

        public MyFactory() {
                r4 = this;
                java.lang.Class<org.jcodec.containers.mp4.boxes.AliasBox> r0 = org.jcodec.containers.mp4.boxes.AliasBox.class
                r4.<init>()
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                r4.mappings = r1
                java.lang.String r2 = org.jcodec.containers.mp4.boxes.UrlBox.fourcc()
                java.lang.Class<org.jcodec.containers.mp4.boxes.UrlBox> r3 = org.jcodec.containers.mp4.boxes.UrlBox.class
                r1.put(r2, r3)
                java.lang.String r2 = org.jcodec.containers.mp4.boxes.AliasBox.fourcc()
                r1.put(r2, r0)
                java.lang.String r2 = "cios"
                r1.put(r2, r0)
                return
        }

        @Override // org.jcodec.containers.mp4.boxes.BoxFactory
        public java.lang.Class<? extends org.jcodec.containers.mp4.boxes.Box> toClass(java.lang.String r2) {
                r1 = this;
                java.util.Map<java.lang.String, java.lang.Class<? extends org.jcodec.containers.mp4.boxes.Box>> r0 = r1.mappings
                java.lang.Object r2 = r0.get(r2)
                java.lang.Class r2 = (java.lang.Class) r2
                return r2
        }
    }

    static {
            org.jcodec.containers.mp4.boxes.DataRefBox$MyFactory r0 = new org.jcodec.containers.mp4.boxes.DataRefBox$MyFactory
            r0.<init>()
            org.jcodec.containers.mp4.boxes.DataRefBox.FACTORY = r0
            return
    }

    public DataRefBox(org.jcodec.containers.mp4.boxes.Header r1) {
            r0 = this;
            r0.<init>(r1)
            org.jcodec.containers.mp4.boxes.DataRefBox$MyFactory r1 = org.jcodec.containers.mp4.boxes.DataRefBox.FACTORY
            r0.factory = r1
            return
    }

    public static org.jcodec.containers.mp4.boxes.DataRefBox createDataRefBox() {
            org.jcodec.containers.mp4.boxes.DataRefBox r0 = new org.jcodec.containers.mp4.boxes.DataRefBox
            org.jcodec.containers.mp4.boxes.Header r1 = new org.jcodec.containers.mp4.boxes.Header
            java.lang.String r2 = fourcc()
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public static java.lang.String fourcc() {
            java.lang.String r0 = "dref"
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.NodeBox, org.jcodec.containers.mp4.boxes.Box
    public void doWrite(java.nio.ByteBuffer r2) {
            r1 = this;
            r0 = 0
            r2.putInt(r0)
            java.util.List<org.jcodec.containers.mp4.boxes.Box> r0 = r1.boxes
            int r0 = r0.size()
            r2.putInt(r0)
            super.doWrite(r2)
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.NodeBox, org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r1) {
            r0 = this;
            r1.getInt()
            r1.getInt()
            super.parse(r1)
            return
    }
}
