package org.fortheloss.sticknodespro;

@android.annotation.TargetApi(18)
/* loaded from: classes2.dex */
public class AndroidColorFormatUtils {

    public static class CodecInfo implements com.badlogic.gdx.utils.Disposable {
        public java.lang.String codecName;
        public int colorFormat;

        public CodecInfo() {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.colorFormat = r0
                return
        }

        @Override // com.badlogic.gdx.utils.Disposable
        public void dispose() {
                r1 = this;
                r0 = 0
                r1.codecName = r0
                return
        }
    }

    public static org.fortheloss.sticknodespro.AndroidColorFormatUtils.CodecInfo getColorFormatYUV() {
            java.lang.String r0 = "video/avc"
            android.media.MediaCodecInfo r1 = selectCodecLollipop(r0)
            r2 = 0
            java.lang.String r3 = "android native mp4 export"
            java.lang.String r4 = "error"
            if (r1 != 0) goto L20
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Failed to find a MediaCodecInfo object."
            r0.println(r1)
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double r1 = java.lang.Double.valueOf(r5)
            r0.analyticsSendValue(r4, r3, r1)
            return r2
        L20:
            java.lang.String r5 = r1.getName()
            int r0 = selectColorFormatLollipop(r1, r0)
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "MediaCodecInfo being used is "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r7 = ", color format being used is "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r7 = "."
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r1.println(r6)
            r1 = -1
            if (r0 != r1) goto L61
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Failed to find a compatible color format."
            r0.println(r1)
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            r5 = 4616189618054758400(0x4010000000000000, double:4.0)
            java.lang.Double r1 = java.lang.Double.valueOf(r5)
            r0.analyticsSendValue(r4, r3, r1)
            return r2
        L61:
            org.fortheloss.sticknodespro.AndroidColorFormatUtils$CodecInfo r1 = new org.fortheloss.sticknodespro.AndroidColorFormatUtils$CodecInfo
            r1.<init>()
            r1.colorFormat = r0
            r1.codecName = r5
            return r1
    }

    private static boolean isCompatibleColorFormat(int r1) {
            r0 = 39
            if (r1 == r0) goto L13
            r0 = 2130706688(0x7f000100, float:1.7014638E38)
            if (r1 == r0) goto L13
            r0 = 2135033992(0x7f420888, float:2.5791453E38)
            if (r1 == r0) goto L13
            switch(r1) {
                case 19: goto L13;
                case 20: goto L13;
                case 21: goto L13;
                default: goto L11;
            }
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }

    @android.annotation.TargetApi(21)
    private static android.media.MediaCodecInfo selectCodecLollipop(java.lang.String r8) {
            android.media.MediaCodecList r0 = new android.media.MediaCodecList
            r1 = 1
            r0.<init>(r1)
            android.media.MediaCodecInfo[] r0 = r0.getCodecInfos()
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Ld:
            if (r3 >= r1) goto L2f
            r4 = r0[r3]
            boolean r5 = r4.isEncoder()
            if (r5 != 0) goto L18
            goto L2c
        L18:
            java.lang.String[] r5 = r4.getSupportedTypes()
            r6 = 0
        L1d:
            int r7 = r5.length
            if (r6 >= r7) goto L2c
            r7 = r5[r6]
            boolean r7 = r7.equalsIgnoreCase(r8)
            if (r7 == 0) goto L29
            return r4
        L29:
            int r6 = r6 + 1
            goto L1d
        L2c:
            int r3 = r3 + 1
            goto Ld
        L2f:
            r8 = 0
            return r8
    }

    @android.annotation.TargetApi(21)
    private static int selectColorFormatLollipop(android.media.MediaCodecInfo r3, java.lang.String r4) {
            android.media.MediaCodecInfo$CodecCapabilities r3 = r3.getCapabilitiesForType(r4)
            r4 = 0
        L5:
            int[] r0 = r3.colorFormats
            int r1 = r0.length
            if (r4 >= r1) goto L17
            r0 = r0[r4]
            boolean r1 = isCompatibleColorFormat(r0)
            r2 = 1
            if (r1 != r2) goto L14
            return r0
        L14:
            int r4 = r4 + 1
            goto L5
        L17:
            r3 = -1
            return r3
    }
}
