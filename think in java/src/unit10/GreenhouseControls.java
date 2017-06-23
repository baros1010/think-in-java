package unit10;

public class GreenhouseControls extends Controller {
	private boolean light = false;

	public class LightOn extends Event {
		public LightOn(long delayTime) {
			super(delayTime);
		}

		public void action() {
			light = true;
		}

		public String toString() {
			return "light is on";
		}
	}

	public class LighOff extends Event {
		public LighOff(long delayTime) {
			super(delayTime);
		}

		public void action() {
			light = false;
		}

		public String toString() {
			return "light is off";
		}
	}

	private boolean water = false;

	public class WaterOn extends Event {

		public WaterOn(long delayTime) {
			super(delayTime);
			// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
		}

		@Override
		public void action() {
			// TODO �����������ꂽ���\�b�h�E�X�^�u
			water = true;
		}

		public String toString() {
			return "water is on";
		}
	}

	public class WaterOff extends Event {

		public WaterOff(long delayTime) {
			super(delayTime);
			// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
		}

		@Override
		public void action() {
			// TODO �����������ꂽ���\�b�h�E�X�^�u
			water = false;
		}

		public String toString() {
			return "water is off";
		}
	}

	private String thermostat = "Day";

	public class ThermostatNight extends Event {

		public ThermostatNight(long delayTime) {
			super(delayTime);
			// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
		}

		@Override
		public void action() {
			// TODO �����������ꂽ���\�b�h�E�X�^�u
			thermostat = "Night";
		}

		public String toString() {
			return "ThermostatNight";
		}
	}

	public class ThermostatDay extends Event {

		public ThermostatDay(long delayTime) {
			super(delayTime);
			// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
		}

		@Override
		public void action() {
			// TODO �����������ꂽ���\�b�h�E�X�^�u
			thermostat = "Day";
		}

		public String toString() {
			return "ThermostatDay";
		}
	}

	public class Bell extends Event {

		public Bell(long delayTime) {
			super(delayTime);
			// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
		}

		@Override
		public void action() {
			// TODO �����������ꂽ���\�b�h�E�X�^�u
			addEvent(new Bell(delayTime));
		}
		public String toString() {
			return "Bell";
		}
	}
	public class Restart extends Event{
			private Event[] eventList;
		public Restart(long delayTime,Event[] eventList) {
			super(delayTime);
			this.eventList=eventList;
			for(Event e:eventList)
				addEvent(e);
			// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
		}

		@Override
		public void action() {
			// TODO �����������ꂽ���\�b�h�E�X�^�u
			for(Event e:eventList){
				e.start();
				addEvent(e);
			}
			start();
			addEvent(this);
		}
		public String toString() {
			return "Restart";
		}
	}
	public static class Terminate extends Event{

		public Terminate(long delayTime) {
			super(delayTime);
			// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
		}

		@Override
		public void action() {
			// TODO �����������ꂽ���\�b�h�E�X�^�u
			System.exit(0);
		}
		public String toString() {
			return "Terminate";
		}
	}
}
