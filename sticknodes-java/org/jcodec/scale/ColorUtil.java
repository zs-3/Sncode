package org.jcodec.scale;

/* loaded from: classes2.dex */
public class ColorUtil {
    private static java.util.Map<org.jcodec.common.model.ColorSpace, java.util.Map<org.jcodec.common.model.ColorSpace, java.lang.Object>> map;
    private static java.util.Map<org.jcodec.common.model.ColorSpace, java.util.Map<org.jcodec.common.model.ColorSpace, org.jcodec.scale.Transform8Bit>> map8Bit;

    @java.lang.Deprecated
    public static class Idential {
        public Idential() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static class Idential8Bit implements org.jcodec.scale.Transform8Bit {
        public Idential8Bit() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.jcodec.scale.Transform8Bit
        public void transform(org.jcodec.common.model.Picture8Bit r8, org.jcodec.common.model.Picture8Bit r9) {
                r7 = this;
                r0 = 0
                r1 = 0
            L2:
                r2 = 3
                if (r1 >= r2) goto L2b
                byte[] r2 = r8.getPlaneData(r1)
                byte[] r3 = r9.getPlaneData(r1)
                int r4 = r8.getPlaneWidth(r1)
                int r5 = r8.getPlaneHeight(r1)
                int r4 = r4 * r5
                int r5 = r9.getPlaneWidth(r1)
                int r6 = r9.getPlaneHeight(r1)
                int r5 = r5 * r6
                int r4 = java.lang.Math.min(r4, r5)
                java.lang.System.arraycopy(r2, r0, r3, r0, r4)
                int r1 = r1 + 1
                goto L2
            L2b:
                return
        }
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.jcodec.scale.ColorUtil.map = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.jcodec.scale.ColorUtil.map8Bit = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.jcodec.common.model.ColorSpace r1 = org.jcodec.common.model.ColorSpace.RGB
            org.jcodec.scale.ColorUtil$Idential r2 = new org.jcodec.scale.ColorUtil$Idential
            r2.<init>()
            r0.put(r1, r2)
            org.jcodec.common.model.ColorSpace r2 = org.jcodec.common.model.ColorSpace.YUV420
            org.jcodec.scale.RgbToYuv420p r3 = new org.jcodec.scale.RgbToYuv420p
            r4 = 0
            r3.<init>(r4, r4)
            r0.put(r2, r3)
            org.jcodec.common.model.ColorSpace r3 = org.jcodec.common.model.ColorSpace.YUV420J
            org.jcodec.scale.RgbToYuv420j r5 = new org.jcodec.scale.RgbToYuv420j
            r5.<init>()
            r0.put(r3, r5)
            org.jcodec.common.model.ColorSpace r5 = org.jcodec.common.model.ColorSpace.YUV422
            org.jcodec.scale.RgbToYuv422p r6 = new org.jcodec.scale.RgbToYuv422p
            r6.<init>(r4, r4)
            r0.put(r5, r6)
            org.jcodec.common.model.ColorSpace r6 = org.jcodec.common.model.ColorSpace.YUV422_10
            org.jcodec.scale.RgbToYuv422p r7 = new org.jcodec.scale.RgbToYuv422p
            r8 = 2
            r7.<init>(r8, r4)
            r0.put(r6, r7)
            java.util.Map<org.jcodec.common.model.ColorSpace, java.util.Map<org.jcodec.common.model.ColorSpace, java.lang.Object>> r7 = org.jcodec.scale.ColorUtil.map
            r7.put(r1, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.jcodec.scale.ColorUtil$Idential r7 = new org.jcodec.scale.ColorUtil$Idential
            r7.<init>()
            r0.put(r2, r7)
            org.jcodec.scale.Yuv420pToRgb r7 = new org.jcodec.scale.Yuv420pToRgb
            r7.<init>(r4, r4)
            r0.put(r1, r7)
            org.jcodec.scale.Yuv420pToYuv422p r7 = new org.jcodec.scale.Yuv420pToYuv422p
            r7.<init>(r4, r4)
            r0.put(r5, r7)
            org.jcodec.scale.Yuv420pToYuv422p r7 = new org.jcodec.scale.Yuv420pToYuv422p
            r7.<init>(r4, r8)
            r0.put(r6, r7)
            java.util.Map<org.jcodec.common.model.ColorSpace, java.util.Map<org.jcodec.common.model.ColorSpace, java.lang.Object>> r7 = org.jcodec.scale.ColorUtil.map
            r7.put(r2, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.jcodec.scale.ColorUtil$Idential r7 = new org.jcodec.scale.ColorUtil$Idential
            r7.<init>()
            r0.put(r5, r7)
            org.jcodec.scale.Yuv422pToRgb r7 = new org.jcodec.scale.Yuv422pToRgb
            r7.<init>(r4, r4)
            r0.put(r1, r7)
            org.jcodec.scale.Yuv422pToYuv420p r7 = new org.jcodec.scale.Yuv422pToYuv420p
            r7.<init>(r4, r4)
            r0.put(r2, r7)
            org.jcodec.scale.Yuv422pToYuv420j r7 = new org.jcodec.scale.Yuv422pToYuv420j
            r7.<init>(r4, r4)
            r0.put(r3, r7)
            java.util.Map<org.jcodec.common.model.ColorSpace, java.util.Map<org.jcodec.common.model.ColorSpace, java.lang.Object>> r7 = org.jcodec.scale.ColorUtil.map
            r7.put(r5, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.jcodec.scale.ColorUtil$Idential r7 = new org.jcodec.scale.ColorUtil$Idential
            r7.<init>()
            r0.put(r6, r7)
            org.jcodec.scale.Yuv422pToRgb r7 = new org.jcodec.scale.Yuv422pToRgb
            r7.<init>(r8, r4)
            r0.put(r1, r7)
            org.jcodec.scale.Yuv422pToYuv420p r7 = new org.jcodec.scale.Yuv422pToYuv420p
            r7.<init>(r4, r8)
            r0.put(r2, r7)
            org.jcodec.scale.Yuv422pToYuv420j r7 = new org.jcodec.scale.Yuv422pToYuv420j
            r7.<init>(r4, r8)
            r0.put(r3, r7)
            java.util.Map<org.jcodec.common.model.ColorSpace, java.util.Map<org.jcodec.common.model.ColorSpace, java.lang.Object>> r7 = org.jcodec.scale.ColorUtil.map
            r7.put(r6, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.jcodec.common.model.ColorSpace r6 = org.jcodec.common.model.ColorSpace.YUV444
            org.jcodec.scale.ColorUtil$Idential r7 = new org.jcodec.scale.ColorUtil$Idential
            r7.<init>()
            r0.put(r6, r7)
            org.jcodec.scale.Yuv444pToRgb r7 = new org.jcodec.scale.Yuv444pToRgb
            r7.<init>(r4, r4)
            r0.put(r1, r7)
            org.jcodec.scale.Yuv444pToYuv420p r7 = new org.jcodec.scale.Yuv444pToYuv420p
            r7.<init>(r4, r4)
            r0.put(r2, r7)
            java.util.Map<org.jcodec.common.model.ColorSpace, java.util.Map<org.jcodec.common.model.ColorSpace, java.lang.Object>> r7 = org.jcodec.scale.ColorUtil.map
            r7.put(r6, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.jcodec.common.model.ColorSpace r7 = org.jcodec.common.model.ColorSpace.YUV444_10
            org.jcodec.scale.ColorUtil$Idential r9 = new org.jcodec.scale.ColorUtil$Idential
            r9.<init>()
            r0.put(r7, r9)
            org.jcodec.scale.Yuv444pToRgb r9 = new org.jcodec.scale.Yuv444pToRgb
            r9.<init>(r8, r4)
            r0.put(r1, r9)
            org.jcodec.scale.Yuv444pToYuv420p r9 = new org.jcodec.scale.Yuv444pToYuv420p
            r9.<init>(r4, r8)
            r0.put(r2, r9)
            java.util.Map<org.jcodec.common.model.ColorSpace, java.util.Map<org.jcodec.common.model.ColorSpace, java.lang.Object>> r8 = org.jcodec.scale.ColorUtil.map
            r8.put(r7, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.jcodec.scale.ColorUtil$Idential r7 = new org.jcodec.scale.ColorUtil$Idential
            r7.<init>()
            r0.put(r3, r7)
            org.jcodec.scale.Yuv420jToRgb r7 = new org.jcodec.scale.Yuv420jToRgb
            r7.<init>()
            r0.put(r1, r7)
            org.jcodec.scale.Yuv420jToYuv420 r7 = new org.jcodec.scale.Yuv420jToYuv420
            r7.<init>()
            r0.put(r2, r7)
            java.util.Map<org.jcodec.common.model.ColorSpace, java.util.Map<org.jcodec.common.model.ColorSpace, java.lang.Object>> r7 = org.jcodec.scale.ColorUtil.map
            r7.put(r3, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.jcodec.common.model.ColorSpace r7 = org.jcodec.common.model.ColorSpace.YUV422J
            org.jcodec.scale.ColorUtil$Idential r8 = new org.jcodec.scale.ColorUtil$Idential
            r8.<init>()
            r0.put(r7, r8)
            org.jcodec.scale.Yuv422jToRgb r8 = new org.jcodec.scale.Yuv422jToRgb
            r8.<init>()
            r0.put(r1, r8)
            org.jcodec.scale.Yuv422jToYuv420p r8 = new org.jcodec.scale.Yuv422jToYuv420p
            r8.<init>()
            r0.put(r2, r8)
            org.jcodec.scale.Yuv422pToYuv420p r8 = new org.jcodec.scale.Yuv422pToYuv420p
            r8.<init>(r4, r4)
            r0.put(r3, r8)
            java.util.Map<org.jcodec.common.model.ColorSpace, java.util.Map<org.jcodec.common.model.ColorSpace, java.lang.Object>> r8 = org.jcodec.scale.ColorUtil.map
            r8.put(r7, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.jcodec.common.model.ColorSpace r7 = org.jcodec.common.model.ColorSpace.YUV444J
            org.jcodec.scale.ColorUtil$Idential r8 = new org.jcodec.scale.ColorUtil$Idential
            r8.<init>()
            r0.put(r7, r8)
            org.jcodec.scale.Yuv444jToRgb r8 = new org.jcodec.scale.Yuv444jToRgb
            r8.<init>()
            r0.put(r1, r8)
            org.jcodec.scale.Yuv444jToYuv420p r8 = new org.jcodec.scale.Yuv444jToYuv420p
            r8.<init>()
            r0.put(r2, r8)
            org.jcodec.scale.Yuv444pToYuv420p r8 = new org.jcodec.scale.Yuv444pToYuv420p
            r8.<init>(r4, r4)
            r0.put(r3, r8)
            java.util.Map<org.jcodec.common.model.ColorSpace, java.util.Map<org.jcodec.common.model.ColorSpace, java.lang.Object>> r4 = org.jcodec.scale.ColorUtil.map
            r4.put(r7, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.jcodec.scale.ColorUtil$Idential8Bit r4 = new org.jcodec.scale.ColorUtil$Idential8Bit
            r4.<init>()
            r0.put(r1, r4)
            org.jcodec.scale.RgbToYuv420j8Bit r4 = new org.jcodec.scale.RgbToYuv420j8Bit
            r4.<init>()
            r0.put(r3, r4)
            org.jcodec.scale.RgbToYuv420p8Bit r4 = new org.jcodec.scale.RgbToYuv420p8Bit
            r4.<init>()
            r0.put(r2, r4)
            java.util.Map<org.jcodec.common.model.ColorSpace, java.util.Map<org.jcodec.common.model.ColorSpace, org.jcodec.scale.Transform8Bit>> r4 = org.jcodec.scale.ColorUtil.map8Bit
            r4.put(r1, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.jcodec.scale.ColorUtil$Idential8Bit r4 = new org.jcodec.scale.ColorUtil$Idential8Bit
            r4.<init>()
            r0.put(r2, r4)
            org.jcodec.scale.Yuv420pToYuv422p8Bit r4 = new org.jcodec.scale.Yuv420pToYuv422p8Bit
            r4.<init>()
            r0.put(r5, r4)
            org.jcodec.scale.Yuv420pToRgb8Bit r4 = new org.jcodec.scale.Yuv420pToRgb8Bit
            r4.<init>()
            r0.put(r1, r4)
            java.util.Map<org.jcodec.common.model.ColorSpace, java.util.Map<org.jcodec.common.model.ColorSpace, org.jcodec.scale.Transform8Bit>> r4 = org.jcodec.scale.ColorUtil.map8Bit
            r4.put(r2, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.jcodec.scale.ColorUtil$Idential8Bit r2 = new org.jcodec.scale.ColorUtil$Idential8Bit
            r2.<init>()
            r0.put(r5, r2)
            java.util.Map<org.jcodec.common.model.ColorSpace, java.util.Map<org.jcodec.common.model.ColorSpace, org.jcodec.scale.Transform8Bit>> r2 = org.jcodec.scale.ColorUtil.map8Bit
            r2.put(r5, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.jcodec.scale.ColorUtil$Idential8Bit r2 = new org.jcodec.scale.ColorUtil$Idential8Bit
            r2.<init>()
            r0.put(r6, r2)
            java.util.Map<org.jcodec.common.model.ColorSpace, java.util.Map<org.jcodec.common.model.ColorSpace, org.jcodec.scale.Transform8Bit>> r2 = org.jcodec.scale.ColorUtil.map8Bit
            r2.put(r6, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.jcodec.scale.ColorUtil$Idential8Bit r2 = new org.jcodec.scale.ColorUtil$Idential8Bit
            r2.<init>()
            r0.put(r3, r2)
            org.jcodec.scale.Yuv420jToRgb8Bit r2 = new org.jcodec.scale.Yuv420jToRgb8Bit
            r2.<init>()
            r0.put(r1, r2)
            java.util.Map<org.jcodec.common.model.ColorSpace, java.util.Map<org.jcodec.common.model.ColorSpace, org.jcodec.scale.Transform8Bit>> r1 = org.jcodec.scale.ColorUtil.map8Bit
            r1.put(r3, r0)
            return
    }

    public static org.jcodec.scale.Transform8Bit getTransform8Bit(org.jcodec.common.model.ColorSpace r1, org.jcodec.common.model.ColorSpace r2) {
            java.util.Map<org.jcodec.common.model.ColorSpace, java.util.Map<org.jcodec.common.model.ColorSpace, org.jcodec.scale.Transform8Bit>> r0 = org.jcodec.scale.ColorUtil.map8Bit
            java.lang.Object r1 = r0.get(r1)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 != 0) goto Lc
            r1 = 0
            goto L12
        Lc:
            java.lang.Object r1 = r1.get(r2)
            org.jcodec.scale.Transform8Bit r1 = (org.jcodec.scale.Transform8Bit) r1
        L12:
            return r1
    }
}
