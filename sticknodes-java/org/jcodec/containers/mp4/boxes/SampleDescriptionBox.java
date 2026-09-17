package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class SampleDescriptionBox extends org.jcodec.containers.mp4.boxes.NodeBox {
    public static final org.jcodec.containers.mp4.boxes.SampleDescriptionBox.MyFactory FACTORY = null;

    public static class MyFactory extends org.jcodec.containers.mp4.boxes.BoxFactory {
        public MyFactory() {
                r8 = this;
                java.lang.Class<org.jcodec.containers.mp4.boxes.TimecodeSampleEntry> r0 = org.jcodec.containers.mp4.boxes.TimecodeSampleEntry.class
                java.lang.Class<org.jcodec.containers.mp4.boxes.SampleEntry> r1 = org.jcodec.containers.mp4.boxes.SampleEntry.class
                java.lang.Class<org.jcodec.containers.mp4.boxes.VideoSampleEntry> r2 = org.jcodec.containers.mp4.boxes.VideoSampleEntry.class
                java.lang.Class<org.jcodec.containers.mp4.boxes.AudioSampleEntry> r3 = org.jcodec.containers.mp4.boxes.AudioSampleEntry.class
                r8.<init>()
                r8.clear()
                java.lang.String r4 = "ap4h"
                r8.override(r4, r2)
                java.lang.String r4 = "apch"
                r8.override(r4, r2)
                java.lang.String r4 = "apcn"
                r8.override(r4, r2)
                java.lang.String r4 = "apcs"
                r8.override(r4, r2)
                java.lang.String r4 = "apco"
                r8.override(r4, r2)
                java.lang.String r4 = "avc1"
                r8.override(r4, r2)
                java.lang.String r4 = "cvid"
                r8.override(r4, r2)
                java.lang.String r4 = "jpeg"
                r8.override(r4, r2)
                java.lang.String r4 = "smc "
                r8.override(r4, r2)
                java.lang.String r4 = "rle "
                r8.override(r4, r2)
                java.lang.String r4 = "rpza"
                r8.override(r4, r2)
                java.lang.String r4 = "kpcd"
                r8.override(r4, r2)
                java.lang.String r4 = "png "
                r8.override(r4, r2)
                java.lang.String r4 = "mjpa"
                r8.override(r4, r2)
                java.lang.String r4 = "mjpb"
                r8.override(r4, r2)
                java.lang.String r4 = "SVQ1"
                r8.override(r4, r2)
                java.lang.String r4 = "SVQ3"
                r8.override(r4, r2)
                java.lang.String r4 = "mp4v"
                r8.override(r4, r2)
                java.lang.String r4 = "dvc "
                r8.override(r4, r2)
                java.lang.String r4 = "dvcp"
                r8.override(r4, r2)
                java.lang.String r4 = "gif "
                r8.override(r4, r2)
                java.lang.String r4 = "h263"
                r8.override(r4, r2)
                java.lang.String r4 = "tiff"
                r8.override(r4, r2)
                java.lang.String r4 = "raw "
                r8.override(r4, r2)
                java.lang.String r5 = "2vuY"
                r8.override(r5, r2)
                java.lang.String r5 = "yuv2"
                r8.override(r5, r2)
                java.lang.String r5 = "v308"
                r8.override(r5, r2)
                java.lang.String r5 = "v408"
                r8.override(r5, r2)
                java.lang.String r5 = "v216"
                r8.override(r5, r2)
                java.lang.String r5 = "v410"
                r8.override(r5, r2)
                java.lang.String r5 = "v210"
                r8.override(r5, r2)
                java.lang.String r5 = "m2v1"
                r8.override(r5, r2)
                java.lang.String r5 = "m1v1"
                r8.override(r5, r2)
                java.lang.String r5 = "xd5b"
                r8.override(r5, r2)
                java.lang.String r5 = "dv5n"
                r8.override(r5, r2)
                java.lang.String r5 = "jp2h"
                r8.override(r5, r2)
                java.lang.String r5 = "mjp2"
                r8.override(r5, r2)
                java.lang.String r2 = "ac-3"
                r8.override(r2, r3)
                java.lang.String r2 = "cac3"
                r8.override(r2, r3)
                java.lang.String r2 = "ima4"
                r8.override(r2, r3)
                java.lang.String r5 = "aac "
                r8.override(r5, r3)
                java.lang.String r5 = "celp"
                r8.override(r5, r3)
                java.lang.String r5 = "hvxc"
                r8.override(r5, r3)
                java.lang.String r5 = "twvq"
                r8.override(r5, r3)
                java.lang.String r5 = ".mp1"
                r8.override(r5, r3)
                java.lang.String r5 = ".mp2"
                r8.override(r5, r3)
                java.lang.String r5 = "midi"
                r8.override(r5, r3)
                java.lang.String r5 = "apvs"
                r8.override(r5, r3)
                java.lang.String r5 = "alac"
                r8.override(r5, r3)
                java.lang.String r5 = "aach"
                r8.override(r5, r3)
                java.lang.String r5 = "aacl"
                r8.override(r5, r3)
                java.lang.String r5 = "aace"
                r8.override(r5, r3)
                java.lang.String r5 = "aacf"
                r8.override(r5, r3)
                java.lang.String r5 = "aacp"
                r8.override(r5, r3)
                java.lang.String r5 = "aacs"
                r8.override(r5, r3)
                java.lang.String r5 = "samr"
                r8.override(r5, r3)
                java.lang.String r5 = "AUDB"
                r8.override(r5, r3)
                java.lang.String r5 = "ilbc"
                r8.override(r5, r3)
                java.lang.String r5 = new java.lang.String
                r6 = 4
                byte[] r7 = new byte[r6]
                r7 = {x01ca: FILL_ARRAY_DATA , data: [109, 115, 0, 17} // fill-array
                r5.<init>(r7)
                r8.override(r5, r3)
                java.lang.String r5 = new java.lang.String
                byte[] r6 = new byte[r6]
                r6 = {x01d0: FILL_ARRAY_DATA , data: [109, 115, 0, 49} // fill-array
                r5.<init>(r6)
                r8.override(r5, r3)
                java.lang.String r5 = "aes3"
                r8.override(r5, r3)
                java.lang.String r5 = "NONE"
                r8.override(r5, r3)
                r8.override(r4, r3)
                java.lang.String r4 = "twos"
                r8.override(r4, r3)
                java.lang.String r4 = "sowt"
                r8.override(r4, r3)
                java.lang.String r4 = "MAC3 "
                r8.override(r4, r3)
                java.lang.String r4 = "MAC6 "
                r8.override(r4, r3)
                r8.override(r2, r3)
                java.lang.String r2 = "fl32"
                r8.override(r2, r3)
                java.lang.String r2 = "fl64"
                r8.override(r2, r3)
                java.lang.String r2 = "in24"
                r8.override(r2, r3)
                java.lang.String r2 = "in32"
                r8.override(r2, r3)
                java.lang.String r2 = "ulaw"
                r8.override(r2, r3)
                java.lang.String r2 = "alaw"
                r8.override(r2, r3)
                java.lang.String r2 = "dvca"
                r8.override(r2, r3)
                java.lang.String r2 = "QDMC"
                r8.override(r2, r3)
                java.lang.String r2 = "QDM2"
                r8.override(r2, r3)
                java.lang.String r2 = "Qclp"
                r8.override(r2, r3)
                java.lang.String r2 = ".mp3"
                r8.override(r2, r3)
                java.lang.String r2 = "mp4a"
                r8.override(r2, r3)
                java.lang.String r2 = "lpcm"
                r8.override(r2, r3)
                java.lang.String r2 = "tmcd"
                r8.override(r2, r0)
                java.lang.String r2 = "time"
                r8.override(r2, r0)
                java.lang.String r0 = "c608"
                r8.override(r0, r1)
                java.lang.String r0 = "c708"
                r8.override(r0, r1)
                java.lang.String r0 = "text"
                r8.override(r0, r1)
                return
        }
    }

    static {
            org.jcodec.containers.mp4.boxes.SampleDescriptionBox$MyFactory r0 = new org.jcodec.containers.mp4.boxes.SampleDescriptionBox$MyFactory
            r0.<init>()
            org.jcodec.containers.mp4.boxes.SampleDescriptionBox.FACTORY = r0
            return
    }

    public SampleDescriptionBox(org.jcodec.containers.mp4.boxes.Header r1) {
            r0 = this;
            r0.<init>(r1)
            org.jcodec.containers.mp4.boxes.SampleDescriptionBox$MyFactory r1 = org.jcodec.containers.mp4.boxes.SampleDescriptionBox.FACTORY
            r0.factory = r1
            return
    }

    public static org.jcodec.containers.mp4.boxes.SampleDescriptionBox createSampleDescriptionBox(org.jcodec.containers.mp4.boxes.SampleEntry... r5) {
            org.jcodec.containers.mp4.boxes.SampleDescriptionBox r0 = new org.jcodec.containers.mp4.boxes.SampleDescriptionBox
            org.jcodec.containers.mp4.boxes.Header r1 = new org.jcodec.containers.mp4.boxes.Header
            java.lang.String r2 = fourcc()
            r1.<init>(r2)
            r0.<init>(r1)
            int r1 = r5.length
            r2 = 0
        L10:
            if (r2 >= r1) goto L1c
            r3 = r5[r2]
            java.util.List<org.jcodec.containers.mp4.boxes.Box> r4 = r0.boxes
            r4.add(r3)
            int r2 = r2 + 1
            goto L10
        L1c:
            return r0
    }

    public static java.lang.String fourcc() {
            java.lang.String r0 = "stsd"
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
