package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class AudioSampleEntry extends org.jcodec.containers.mp4.boxes.SampleEntry {
    private static final org.jcodec.containers.mp4.boxes.AudioSampleEntry.MyFactory FACTORY = null;
    public static java.util.Set<java.lang.String> pcms;
    private static java.util.Map<org.jcodec.containers.mp4.boxes.channel.Label, org.jcodec.common.model.ChannelLabel> translationStereo;
    private static java.util.Map<org.jcodec.containers.mp4.boxes.channel.Label, org.jcodec.common.model.ChannelLabel> translationSurround;
    private int bytesPerFrame;
    private int bytesPerPkt;
    private int bytesPerSample;
    private short channelCount;
    private int compressionId;
    private int lpcmFlags;
    private int pktSize;
    private short revision;
    private float sampleRate;
    private short sampleSize;
    private int samplesPerPkt;
    private int vendor;
    private short version;

    public static class MyFactory extends org.jcodec.containers.mp4.boxes.BoxFactory {
        private final java.util.Map<java.lang.String, java.lang.Class<? extends org.jcodec.containers.mp4.boxes.Box>> mappings;

        public MyFactory() {
                r3 = this;
                r3.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r3.mappings = r0
                java.lang.String r1 = org.jcodec.containers.mp4.boxes.WaveExtension.fourcc()
                java.lang.Class<org.jcodec.containers.mp4.boxes.WaveExtension> r2 = org.jcodec.containers.mp4.boxes.WaveExtension.class
                r0.put(r1, r2)
                java.lang.String r1 = org.jcodec.containers.mp4.boxes.ChannelBox.fourcc()
                java.lang.Class<org.jcodec.containers.mp4.boxes.ChannelBox> r2 = org.jcodec.containers.mp4.boxes.ChannelBox.class
                r0.put(r1, r2)
                java.lang.Class<org.jcodec.containers.mp4.boxes.LeafBox> r1 = org.jcodec.containers.mp4.boxes.LeafBox.class
                java.lang.String r2 = "esds"
                r0.put(r2, r1)
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
            org.jcodec.containers.mp4.boxes.AudioSampleEntry$MyFactory r0 = new org.jcodec.containers.mp4.boxes.AudioSampleEntry$MyFactory
            r0.<init>()
            org.jcodec.containers.mp4.boxes.AudioSampleEntry.FACTORY = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            org.jcodec.containers.mp4.boxes.AudioSampleEntry.pcms = r0
            java.lang.String r1 = "raw "
            r0.add(r1)
            java.util.Set<java.lang.String> r0 = org.jcodec.containers.mp4.boxes.AudioSampleEntry.pcms
            java.lang.String r1 = "twos"
            r0.add(r1)
            java.util.Set<java.lang.String> r0 = org.jcodec.containers.mp4.boxes.AudioSampleEntry.pcms
            java.lang.String r1 = "sowt"
            r0.add(r1)
            java.util.Set<java.lang.String> r0 = org.jcodec.containers.mp4.boxes.AudioSampleEntry.pcms
            java.lang.String r1 = "fl32"
            r0.add(r1)
            java.util.Set<java.lang.String> r0 = org.jcodec.containers.mp4.boxes.AudioSampleEntry.pcms
            java.lang.String r1 = "fl64"
            r0.add(r1)
            java.util.Set<java.lang.String> r0 = org.jcodec.containers.mp4.boxes.AudioSampleEntry.pcms
            java.lang.String r1 = "in24"
            r0.add(r1)
            java.util.Set<java.lang.String> r0 = org.jcodec.containers.mp4.boxes.AudioSampleEntry.pcms
            java.lang.String r1 = "in32"
            r0.add(r1)
            java.util.Set<java.lang.String> r0 = org.jcodec.containers.mp4.boxes.AudioSampleEntry.pcms
            java.lang.String r1 = "lpcm"
            r0.add(r1)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.jcodec.containers.mp4.boxes.AudioSampleEntry.translationStereo = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.jcodec.containers.mp4.boxes.AudioSampleEntry.translationSurround = r0
            java.util.Map<org.jcodec.containers.mp4.boxes.channel.Label, org.jcodec.common.model.ChannelLabel> r0 = org.jcodec.containers.mp4.boxes.AudioSampleEntry.translationStereo
            org.jcodec.containers.mp4.boxes.channel.Label r1 = org.jcodec.containers.mp4.boxes.channel.Label.Left
            org.jcodec.common.model.ChannelLabel r2 = org.jcodec.common.model.ChannelLabel.STEREO_LEFT
            r0.put(r1, r2)
            java.util.Map<org.jcodec.containers.mp4.boxes.channel.Label, org.jcodec.common.model.ChannelLabel> r0 = org.jcodec.containers.mp4.boxes.AudioSampleEntry.translationStereo
            org.jcodec.containers.mp4.boxes.channel.Label r3 = org.jcodec.containers.mp4.boxes.channel.Label.Right
            org.jcodec.common.model.ChannelLabel r4 = org.jcodec.common.model.ChannelLabel.STEREO_RIGHT
            r0.put(r3, r4)
            java.util.Map<org.jcodec.containers.mp4.boxes.channel.Label, org.jcodec.common.model.ChannelLabel> r0 = org.jcodec.containers.mp4.boxes.AudioSampleEntry.translationStereo
            org.jcodec.containers.mp4.boxes.channel.Label r5 = org.jcodec.containers.mp4.boxes.channel.Label.HeadphonesLeft
            r0.put(r5, r2)
            java.util.Map<org.jcodec.containers.mp4.boxes.channel.Label, org.jcodec.common.model.ChannelLabel> r0 = org.jcodec.containers.mp4.boxes.AudioSampleEntry.translationStereo
            org.jcodec.containers.mp4.boxes.channel.Label r5 = org.jcodec.containers.mp4.boxes.channel.Label.HeadphonesRight
            r0.put(r5, r4)
            java.util.Map<org.jcodec.containers.mp4.boxes.channel.Label, org.jcodec.common.model.ChannelLabel> r0 = org.jcodec.containers.mp4.boxes.AudioSampleEntry.translationStereo
            org.jcodec.containers.mp4.boxes.channel.Label r5 = org.jcodec.containers.mp4.boxes.channel.Label.LeftTotal
            r0.put(r5, r2)
            java.util.Map<org.jcodec.containers.mp4.boxes.channel.Label, org.jcodec.common.model.ChannelLabel> r0 = org.jcodec.containers.mp4.boxes.AudioSampleEntry.translationStereo
            org.jcodec.containers.mp4.boxes.channel.Label r6 = org.jcodec.containers.mp4.boxes.channel.Label.RightTotal
            r0.put(r6, r4)
            java.util.Map<org.jcodec.containers.mp4.boxes.channel.Label, org.jcodec.common.model.ChannelLabel> r0 = org.jcodec.containers.mp4.boxes.AudioSampleEntry.translationStereo
            org.jcodec.containers.mp4.boxes.channel.Label r7 = org.jcodec.containers.mp4.boxes.channel.Label.LeftWide
            r0.put(r7, r2)
            java.util.Map<org.jcodec.containers.mp4.boxes.channel.Label, org.jcodec.common.model.ChannelLabel> r0 = org.jcodec.containers.mp4.boxes.AudioSampleEntry.translationStereo
            org.jcodec.containers.mp4.boxes.channel.Label r8 = org.jcodec.containers.mp4.boxes.channel.Label.RightWide
            r0.put(r8, r4)
            java.util.Map<org.jcodec.containers.mp4.boxes.channel.Label, org.jcodec.common.model.ChannelLabel> r0 = org.jcodec.containers.mp4.boxes.AudioSampleEntry.translationSurround
            org.jcodec.common.model.ChannelLabel r9 = org.jcodec.common.model.ChannelLabel.FRONT_LEFT
            r0.put(r1, r9)
            java.util.Map<org.jcodec.containers.mp4.boxes.channel.Label, org.jcodec.common.model.ChannelLabel> r0 = org.jcodec.containers.mp4.boxes.AudioSampleEntry.translationSurround
            org.jcodec.common.model.ChannelLabel r1 = org.jcodec.common.model.ChannelLabel.FRONT_RIGHT
            r0.put(r3, r1)
            java.util.Map<org.jcodec.containers.mp4.boxes.channel.Label, org.jcodec.common.model.ChannelLabel> r0 = org.jcodec.containers.mp4.boxes.AudioSampleEntry.translationSurround
            org.jcodec.containers.mp4.boxes.channel.Label r1 = org.jcodec.containers.mp4.boxes.channel.Label.LeftCenter
            org.jcodec.common.model.ChannelLabel r3 = org.jcodec.common.model.ChannelLabel.FRONT_CENTER_LEFT
            r0.put(r1, r3)
            java.util.Map<org.jcodec.containers.mp4.boxes.channel.Label, org.jcodec.common.model.ChannelLabel> r0 = org.jcodec.containers.mp4.boxes.AudioSampleEntry.translationSurround
            org.jcodec.containers.mp4.boxes.channel.Label r1 = org.jcodec.containers.mp4.boxes.channel.Label.RightCenter
            org.jcodec.common.model.ChannelLabel r3 = org.jcodec.common.model.ChannelLabel.FRONT_CENTER_RIGHT
            r0.put(r1, r3)
            java.util.Map<org.jcodec.containers.mp4.boxes.channel.Label, org.jcodec.common.model.ChannelLabel> r0 = org.jcodec.containers.mp4.boxes.AudioSampleEntry.translationSurround
            org.jcodec.containers.mp4.boxes.channel.Label r1 = org.jcodec.containers.mp4.boxes.channel.Label.Center
            org.jcodec.common.model.ChannelLabel r3 = org.jcodec.common.model.ChannelLabel.CENTER
            r0.put(r1, r3)
            java.util.Map<org.jcodec.containers.mp4.boxes.channel.Label, org.jcodec.common.model.ChannelLabel> r0 = org.jcodec.containers.mp4.boxes.AudioSampleEntry.translationSurround
            org.jcodec.containers.mp4.boxes.channel.Label r1 = org.jcodec.containers.mp4.boxes.channel.Label.CenterSurround
            org.jcodec.common.model.ChannelLabel r3 = org.jcodec.common.model.ChannelLabel.REAR_CENTER
            r0.put(r1, r3)
            java.util.Map<org.jcodec.containers.mp4.boxes.channel.Label, org.jcodec.common.model.ChannelLabel> r0 = org.jcodec.containers.mp4.boxes.AudioSampleEntry.translationSurround
            org.jcodec.containers.mp4.boxes.channel.Label r1 = org.jcodec.containers.mp4.boxes.channel.Label.CenterSurroundDirect
            r0.put(r1, r3)
            java.util.Map<org.jcodec.containers.mp4.boxes.channel.Label, org.jcodec.common.model.ChannelLabel> r0 = org.jcodec.containers.mp4.boxes.AudioSampleEntry.translationSurround
            org.jcodec.containers.mp4.boxes.channel.Label r1 = org.jcodec.containers.mp4.boxes.channel.Label.LeftSurround
            org.jcodec.common.model.ChannelLabel r3 = org.jcodec.common.model.ChannelLabel.REAR_LEFT
            r0.put(r1, r3)
            java.util.Map<org.jcodec.containers.mp4.boxes.channel.Label, org.jcodec.common.model.ChannelLabel> r0 = org.jcodec.containers.mp4.boxes.AudioSampleEntry.translationSurround
            org.jcodec.containers.mp4.boxes.channel.Label r1 = org.jcodec.containers.mp4.boxes.channel.Label.LeftSurroundDirect
            r0.put(r1, r3)
            java.util.Map<org.jcodec.containers.mp4.boxes.channel.Label, org.jcodec.common.model.ChannelLabel> r0 = org.jcodec.containers.mp4.boxes.AudioSampleEntry.translationSurround
            org.jcodec.containers.mp4.boxes.channel.Label r1 = org.jcodec.containers.mp4.boxes.channel.Label.RightSurround
            org.jcodec.common.model.ChannelLabel r3 = org.jcodec.common.model.ChannelLabel.REAR_RIGHT
            r0.put(r1, r3)
            java.util.Map<org.jcodec.containers.mp4.boxes.channel.Label, org.jcodec.common.model.ChannelLabel> r0 = org.jcodec.containers.mp4.boxes.AudioSampleEntry.translationSurround
            org.jcodec.containers.mp4.boxes.channel.Label r1 = org.jcodec.containers.mp4.boxes.channel.Label.RightSurroundDirect
            r0.put(r1, r3)
            java.util.Map<org.jcodec.containers.mp4.boxes.channel.Label, org.jcodec.common.model.ChannelLabel> r0 = org.jcodec.containers.mp4.boxes.AudioSampleEntry.translationSurround
            org.jcodec.containers.mp4.boxes.channel.Label r1 = org.jcodec.containers.mp4.boxes.channel.Label.RearSurroundLeft
            org.jcodec.common.model.ChannelLabel r3 = org.jcodec.common.model.ChannelLabel.SIDE_LEFT
            r0.put(r1, r3)
            java.util.Map<org.jcodec.containers.mp4.boxes.channel.Label, org.jcodec.common.model.ChannelLabel> r0 = org.jcodec.containers.mp4.boxes.AudioSampleEntry.translationSurround
            org.jcodec.containers.mp4.boxes.channel.Label r1 = org.jcodec.containers.mp4.boxes.channel.Label.RearSurroundRight
            org.jcodec.common.model.ChannelLabel r3 = org.jcodec.common.model.ChannelLabel.SIDE_RIGHT
            r0.put(r1, r3)
            java.util.Map<org.jcodec.containers.mp4.boxes.channel.Label, org.jcodec.common.model.ChannelLabel> r0 = org.jcodec.containers.mp4.boxes.AudioSampleEntry.translationSurround
            org.jcodec.containers.mp4.boxes.channel.Label r1 = org.jcodec.containers.mp4.boxes.channel.Label.LFE2
            org.jcodec.common.model.ChannelLabel r3 = org.jcodec.common.model.ChannelLabel.LFE
            r0.put(r1, r3)
            java.util.Map<org.jcodec.containers.mp4.boxes.channel.Label, org.jcodec.common.model.ChannelLabel> r0 = org.jcodec.containers.mp4.boxes.AudioSampleEntry.translationSurround
            org.jcodec.containers.mp4.boxes.channel.Label r1 = org.jcodec.containers.mp4.boxes.channel.Label.LFEScreen
            r0.put(r1, r3)
            java.util.Map<org.jcodec.containers.mp4.boxes.channel.Label, org.jcodec.common.model.ChannelLabel> r0 = org.jcodec.containers.mp4.boxes.AudioSampleEntry.translationSurround
            r0.put(r5, r2)
            java.util.Map<org.jcodec.containers.mp4.boxes.channel.Label, org.jcodec.common.model.ChannelLabel> r0 = org.jcodec.containers.mp4.boxes.AudioSampleEntry.translationSurround
            r0.put(r6, r4)
            java.util.Map<org.jcodec.containers.mp4.boxes.channel.Label, org.jcodec.common.model.ChannelLabel> r0 = org.jcodec.containers.mp4.boxes.AudioSampleEntry.translationSurround
            r0.put(r7, r2)
            java.util.Map<org.jcodec.containers.mp4.boxes.channel.Label, org.jcodec.common.model.ChannelLabel> r0 = org.jcodec.containers.mp4.boxes.AudioSampleEntry.translationSurround
            r0.put(r8, r4)
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.SampleEntry, org.jcodec.containers.mp4.boxes.NodeBox, org.jcodec.containers.mp4.boxes.Box
    protected void doWrite(java.nio.ByteBuffer r5) {
            r4 = this;
            super.doWrite(r5)
            short r0 = r4.version
            r5.putShort(r0)
            short r0 = r4.revision
            r5.putShort(r0)
            int r0 = r4.vendor
            r5.putInt(r0)
            short r0 = r4.version
            r1 = 16
            r2 = 2
            if (r0 >= r2) goto L60
            short r0 = r4.channelCount
            r5.putShort(r0)
            short r0 = r4.version
            if (r0 != 0) goto L28
            short r0 = r4.sampleSize
            r5.putShort(r0)
            goto L2b
        L28:
            r5.putShort(r1)
        L2b:
            int r0 = r4.compressionId
            short r0 = (short) r0
            r5.putShort(r0)
            int r0 = r4.pktSize
            short r0 = (short) r0
            r5.putShort(r0)
            float r0 = r4.sampleRate
            double r0 = (double) r0
            r2 = 4679240012837945344(0x40f0000000000000, double:65536.0)
            double r0 = r0 * r2
            long r0 = java.lang.Math.round(r0)
            int r1 = (int) r0
            r5.putInt(r1)
            short r0 = r4.version
            r1 = 1
            if (r0 != r1) goto La3
            int r0 = r4.samplesPerPkt
            r5.putInt(r0)
            int r0 = r4.bytesPerPkt
            r5.putInt(r0)
            int r0 = r4.bytesPerFrame
            r5.putInt(r0)
            int r0 = r4.bytesPerSample
            r5.putInt(r0)
            goto La3
        L60:
            if (r0 != r2) goto La3
            r0 = 3
            r5.putShort(r0)
            r5.putShort(r1)
            r0 = -2
            r5.putShort(r0)
            r0 = 0
            r5.putShort(r0)
            r0 = 65536(0x10000, float:9.18355E-41)
            r5.putInt(r0)
            r0 = 72
            r5.putInt(r0)
            float r0 = r4.sampleRate
            double r0 = (double) r0
            long r0 = java.lang.Double.doubleToLongBits(r0)
            r5.putLong(r0)
            short r0 = r4.channelCount
            r5.putInt(r0)
            r0 = 2130706432(0x7f000000, float:1.7014118E38)
            r5.putInt(r0)
            short r0 = r4.sampleSize
            r5.putInt(r0)
            int r0 = r4.lpcmFlags
            r5.putInt(r0)
            int r0 = r4.bytesPerFrame
            r5.putInt(r0)
            int r0 = r4.samplesPerPkt
            r5.putInt(r0)
        La3:
            r4.writeExtensions(r5)
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.SampleEntry, org.jcodec.containers.mp4.boxes.NodeBox, org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r5) {
            r4 = this;
            super.parse(r5)
            short r0 = r5.getShort()
            r4.version = r0
            short r0 = r5.getShort()
            r4.revision = r0
            int r0 = r5.getInt()
            r4.vendor = r0
            short r0 = r5.getShort()
            r4.channelCount = r0
            short r0 = r5.getShort()
            r4.sampleSize = r0
            short r0 = r5.getShort()
            r4.compressionId = r0
            short r0 = r5.getShort()
            r4.pktSize = r0
            int r0 = r5.getInt()
            long r0 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            float r0 = (float) r0
            r1 = 1199570944(0x47800000, float:65536.0)
            float r0 = r0 / r1
            r4.sampleRate = r0
            short r0 = r4.version
            r1 = 1
            if (r0 != r1) goto L5c
            int r0 = r5.getInt()
            r4.samplesPerPkt = r0
            int r0 = r5.getInt()
            r4.bytesPerPkt = r0
            int r0 = r5.getInt()
            r4.bytesPerFrame = r0
            int r0 = r5.getInt()
            r4.bytesPerSample = r0
            goto L90
        L5c:
            r1 = 2
            if (r0 != r1) goto L90
            r5.getInt()
            long r0 = r5.getLong()
            double r0 = java.lang.Double.longBitsToDouble(r0)
            float r0 = (float) r0
            r4.sampleRate = r0
            int r0 = r5.getInt()
            short r0 = (short) r0
            r4.channelCount = r0
            r5.getInt()
            int r0 = r5.getInt()
            short r0 = (short) r0
            r4.sampleSize = r0
            int r0 = r5.getInt()
            r4.lpcmFlags = r0
            int r0 = r5.getInt()
            r4.bytesPerFrame = r0
            int r0 = r5.getInt()
            r4.samplesPerPkt = r0
        L90:
            r4.parseExtensions(r5)
            return
    }
}
