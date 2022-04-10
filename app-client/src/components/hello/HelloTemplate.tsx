import { HelloDTO } from "../../generated";

type Props = {
  hello: HelloDTO;
};
export function HelloTemplate({ hello }: Props) {
  return <p>{hello.message}</p>;
}
