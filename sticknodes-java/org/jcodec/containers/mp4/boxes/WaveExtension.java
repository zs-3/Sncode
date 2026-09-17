package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class WaveExtension extends org.jcodec.containers.mp4.boxes.NodeBox {
    private static final org.jcodec.containers.mp4.boxes.WaveExtension.MyFactory FACTORY = null;

    public static class MyFactory extends org.jcodec.containers.mp4.boxes.BoxFactory {
        private java.util.Map<java.lang.String, java.lang.Class<? extends org.jcodec.containers.mp4.boxes.Box>> mappings;

        public MyFactory() {
                r3 = this;
                r3.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r3.mappings = r0
                java.lang.String r1 = org.jcodec.containers.mp4.boxes.FormatBox.fourcc()
                java.lang.Class<org.jcodec.containers.mp4.boxes.FormatBox> r2 = org.jcodec.containers.mp4.boxes.FormatBox.class
                r0.put(r1, r2)
                java.util.Map<java.lang.String, java.lang.Class<? extends org.jcodec.containers.mp4.boxes.Box>> r0 = r3.mappings
                java.lang.String r1 = org.jcodec.containers.mp4.boxes.EndianBox.fourcc()
                java.lang.Class<org.jcodec.containers.mp4.boxes.EndianBox> r2 = org.jcodec.containers.mp4.boxes.EndianBox.class
                r0.put(r1, r2)
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
            org.jcodec.containers.mp4.boxes.WaveExtension$MyFactory r0 = new org.jcodec.containers.mp4.boxes.WaveExtension$MyFactory
            r0.<init>()
            org.jcodec.containers.mp4.boxes.WaveExtension.FACTORY = r0
            return
    }

    public static java.lang.String fourcc() {
            java.lang.String r0 = "wave"
            return r0
    }
}
