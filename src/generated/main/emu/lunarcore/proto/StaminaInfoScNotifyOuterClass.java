// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class StaminaInfoScNotifyOuterClass {
  /**
   * Protobuf type {@code StaminaInfoScNotify}
   */
  public static final class StaminaInfoScNotify extends ProtoMessage<StaminaInfoScNotify> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional int64 next_recover_time = 3;</code>
     */
    private long nextRecoverTime;

    /**
     * <code>optional uint32 stamina = 5;</code>
     */
    private int stamina;

    /**
     * <code>optional uint32 reserve_stamina = 11;</code>
     */
    private int reserveStamina;

    private StaminaInfoScNotify() {
    }

    /**
     * @return a new empty instance of {@code StaminaInfoScNotify}
     */
    public static StaminaInfoScNotify newInstance() {
      return new StaminaInfoScNotify();
    }

    /**
     * <code>optional int64 next_recover_time = 3;</code>
     * @return whether the nextRecoverTime field is set
     */
    public boolean hasNextRecoverTime() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional int64 next_recover_time = 3;</code>
     * @return this
     */
    public StaminaInfoScNotify clearNextRecoverTime() {
      bitField0_ &= ~0x00000001;
      nextRecoverTime = 0L;
      return this;
    }

    /**
     * <code>optional int64 next_recover_time = 3;</code>
     * @return the nextRecoverTime
     */
    public long getNextRecoverTime() {
      return nextRecoverTime;
    }

    /**
     * <code>optional int64 next_recover_time = 3;</code>
     * @param value the nextRecoverTime to set
     * @return this
     */
    public StaminaInfoScNotify setNextRecoverTime(final long value) {
      bitField0_ |= 0x00000001;
      nextRecoverTime = value;
      return this;
    }

    /**
     * <code>optional uint32 stamina = 5;</code>
     * @return whether the stamina field is set
     */
    public boolean hasStamina() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 stamina = 5;</code>
     * @return this
     */
    public StaminaInfoScNotify clearStamina() {
      bitField0_ &= ~0x00000002;
      stamina = 0;
      return this;
    }

    /**
     * <code>optional uint32 stamina = 5;</code>
     * @return the stamina
     */
    public int getStamina() {
      return stamina;
    }

    /**
     * <code>optional uint32 stamina = 5;</code>
     * @param value the stamina to set
     * @return this
     */
    public StaminaInfoScNotify setStamina(final int value) {
      bitField0_ |= 0x00000002;
      stamina = value;
      return this;
    }

    /**
     * <code>optional uint32 reserve_stamina = 11;</code>
     * @return whether the reserveStamina field is set
     */
    public boolean hasReserveStamina() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 reserve_stamina = 11;</code>
     * @return this
     */
    public StaminaInfoScNotify clearReserveStamina() {
      bitField0_ &= ~0x00000004;
      reserveStamina = 0;
      return this;
    }

    /**
     * <code>optional uint32 reserve_stamina = 11;</code>
     * @return the reserveStamina
     */
    public int getReserveStamina() {
      return reserveStamina;
    }

    /**
     * <code>optional uint32 reserve_stamina = 11;</code>
     * @param value the reserveStamina to set
     * @return this
     */
    public StaminaInfoScNotify setReserveStamina(final int value) {
      bitField0_ |= 0x00000004;
      reserveStamina = value;
      return this;
    }

    @Override
    public StaminaInfoScNotify copyFrom(final StaminaInfoScNotify other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        nextRecoverTime = other.nextRecoverTime;
        stamina = other.stamina;
        reserveStamina = other.reserveStamina;
      }
      return this;
    }

    @Override
    public StaminaInfoScNotify mergeFrom(final StaminaInfoScNotify other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasNextRecoverTime()) {
        setNextRecoverTime(other.nextRecoverTime);
      }
      if (other.hasStamina()) {
        setStamina(other.stamina);
      }
      if (other.hasReserveStamina()) {
        setReserveStamina(other.reserveStamina);
      }
      return this;
    }

    @Override
    public StaminaInfoScNotify clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      nextRecoverTime = 0L;
      stamina = 0;
      reserveStamina = 0;
      return this;
    }

    @Override
    public StaminaInfoScNotify clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof StaminaInfoScNotify)) {
        return false;
      }
      StaminaInfoScNotify other = (StaminaInfoScNotify) o;
      return bitField0_ == other.bitField0_
        && (!hasNextRecoverTime() || nextRecoverTime == other.nextRecoverTime)
        && (!hasStamina() || stamina == other.stamina)
        && (!hasReserveStamina() || reserveStamina == other.reserveStamina);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeInt64NoTag(nextRecoverTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(stamina);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(reserveStamina);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeInt64SizeNoTag(nextRecoverTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(stamina);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(reserveStamina);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public StaminaInfoScNotify mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // nextRecoverTime
            nextRecoverTime = input.readInt64();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // stamina
            stamina = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // reserveStamina
            reserveStamina = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeInt64(FieldNames.nextRecoverTime, nextRecoverTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.stamina, stamina);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.reserveStamina, reserveStamina);
      }
      output.endObject();
    }

    @Override
    public StaminaInfoScNotify mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1964148386:
          case 394600084: {
            if (input.isAtField(FieldNames.nextRecoverTime)) {
              if (!input.trySkipNullValue()) {
                nextRecoverTime = input.readInt64();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1897344401: {
            if (input.isAtField(FieldNames.stamina)) {
              if (!input.trySkipNullValue()) {
                stamina = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -273362413:
          case -799929876: {
            if (input.isAtField(FieldNames.reserveStamina)) {
              if (!input.trySkipNullValue()) {
                reserveStamina = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public StaminaInfoScNotify clone() {
      return new StaminaInfoScNotify().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static StaminaInfoScNotify parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new StaminaInfoScNotify(), data).checkInitialized();
    }

    public static StaminaInfoScNotify parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new StaminaInfoScNotify(), input).checkInitialized();
    }

    public static StaminaInfoScNotify parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new StaminaInfoScNotify(), input).checkInitialized();
    }

    /**
     * @return factory for creating StaminaInfoScNotify messages
     */
    public static MessageFactory<StaminaInfoScNotify> getFactory() {
      return StaminaInfoScNotifyFactory.INSTANCE;
    }

    private enum StaminaInfoScNotifyFactory implements MessageFactory<StaminaInfoScNotify> {
      INSTANCE;

      @Override
      public StaminaInfoScNotify create() {
        return StaminaInfoScNotify.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName nextRecoverTime = FieldName.forField("nextRecoverTime", "next_recover_time");

      static final FieldName stamina = FieldName.forField("stamina");

      static final FieldName reserveStamina = FieldName.forField("reserveStamina", "reserve_stamina");
    }
  }
}